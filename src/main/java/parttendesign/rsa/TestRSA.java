package parttendesign.rsa;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import java.io.ByteArrayOutputStream;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor.rsa
 * @date 2020/3/12 17:11
 * @Copyright © 2019
 */

/**
 * 二、RSA加密、签名区别
 * <p>
 * 　　加密和签名都是为了安全性考虑，但略有不同。常有人问加密和签名是用私钥还是公钥？其实都是对加密和签名的作用有所混淆。
 * 简单的说，加密是为了防止信息被泄露，而签名是为了防止信息被篡改。这里举2个例子说明。
 * <p>
 * 第一个场景：战场上，B要给A传递一条消息，内容为某一指令。
 * <p>
 * RSA的加密过程如下：
 * <p>
 * （1）A生成一对密钥（公钥和私钥），私钥不公开，A自己保留。公钥为公开的，任何人可以获取。
 * <p>
 * （2）A传递自己的公钥给B，B用A的公钥对消息进行加密。
 * <p>
 * （3）A接收到B加密的消息，利用A自己的私钥对消息进行解密。
 * <p>
 * 　　在这个过程中，只有2次传递过程，第一次是A传递公钥给B，第二次是B传递加密消息给A，即使都被敌方截获，也没有危险性，
 * 因为只有A的私钥才能对消息进行解密，防止了消息内容的泄露。
 * <p>
 * <p>
 * <p>
 * 第二个场景：A收到B发的消息后，需要进行回复“收到”。
 * <p>
 * RSA签名的过程如下：
 * <p>
 * （1）A生成一对密钥（公钥和私钥），私钥不公开，A自己保留。公钥为公开的，任何人可以获取。
 * <p>
 * （2）A用自己的私钥对消息加签，形成签名，并将加签的消息和消息本身一起传递给B。
 * <p>
 * （3）B收到消息后，在获取A的公钥进行验签，如果验签出来的内容与消息本身一致，证明消息是A回复的。
 * <p>
 * 　　在这个过程中，只有2次传递过程，第一次是A传递加签的消息和消息本身给B，第二次是B获取A的公钥，
 * 即使都被敌方截获，也没有危险性，因为只有A的私钥才能对消息进行签名，即使知道了消息内容，也无法伪造带签名的回复给B，防止了消息内容的篡改。
 * <p>
 * <p>
 * <p>
 * 　　但是，综合两个场景你会发现，第一个场景虽然被截获的消息没有泄露，但是可以利用截获的公钥，将假指令进行加密，然后传递给A。
 * 第二个场景虽然截获的消息不能被篡改，但是消息的内容可以利用公钥验签来获得，并不能防止泄露。所以在实际应用中，要根据情况使用，也可以同时使用加密和签名，比如A和B都有一套自己的公钥和私钥，当A要给B发送消息时，先用B的公钥对消息加密，
 * 再对加密的消息使用A的私钥加签名，达到既不泄露也不被篡改，更能保证消息的安全性。
 */
public class TestRSA {
    private static final int MAX_ENCRYPT_BLOCK = 117;
    private static final int MAX_DECRYPT_BLOCK = 128;

    //获取密钥对
    public static KeyPair getKeyPaire() throws NoSuchAlgorithmException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(1024);
        return keyPairGenerator.generateKeyPair();
    }


    //privateKey 私钥字符串

    public static PrivateKey getPrivateKey(String privatekey) throws NoSuchAlgorithmException, InvalidKeySpecException {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        byte[] decodeKey = Base64.decodeBase64(privatekey.getBytes());
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(decodeKey);
        return keyFactory.generatePrivate(keySpec);
    }


    //获取公钥
    public static PublicKey getpublicKey(String publickey) throws Exception {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        byte[] decodeKey = Base64.decodeBase64(publickey.getBytes());
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(decodeKey);
        return keyFactory.generatePublic(keySpec);
    }


    //RSA加密
    public static String encrypt(String data, PublicKey publicKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        int inputLength = data.getBytes().length;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        int offset = 0;
        byte[] cache;
        int i = 0;

        // 对数据分段加密
        while (inputLength - offset > 0) {
            if (inputLength - offset > MAX_ENCRYPT_BLOCK) {
                cache = cipher.doFinal(data.getBytes(), offset, MAX_ENCRYPT_BLOCK);
            } else {
                cache = cipher.doFinal(data.getBytes(), offset, inputLength - offset);
            }

            outputStream.write(cache, 0, cache.length);
            i++;
            offset = i * MAX_ENCRYPT_BLOCK;
        }
        byte[] encryptedData = outputStream.toByteArray();
        outputStream.close();
        // 获取加密内容使用base64进行编码,并以UTF-8为标准转化成字符串
        // 加密后的字符串
        return new String(Base64.encodeBase64String(encryptedData));

    }

//私钥解密

    public static String decrypt(String data, PrivateKey privateKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] dataBytes = Base64.decodeBase64(data);
        int inputLen = dataBytes.length;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int offset = 0;
        byte[] cache;
        int i = 0;
        // 对数据分段解密
        while (inputLen - offset > 0) {
            if (inputLen - offset > MAX_DECRYPT_BLOCK) {
                cache = cipher.doFinal(dataBytes, offset, MAX_DECRYPT_BLOCK);
            } else {
                cache = cipher.doFinal(dataBytes, offset, inputLen - offset);
            }
            out.write(cache, 0, cache.length);
            i++;
            offset = i * MAX_DECRYPT_BLOCK;
        }
        byte[] decryptedData = out.toByteArray();
        out.close();
        // 解密后的内容
        return new String(decryptedData, "UTF-8");
    }


    /**
     * 129      * 签名
     * 130      *
     * 131      * @param data 待签名数据
     * 132      * @param privateKey 私钥
     * 133      * @return 签名
     * 134
     */


    public static String sign(String data, PrivateKey privateKey) throws Exception {
        byte[] keyBytes = privateKey.getEncoded();
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PrivateKey key = keyFactory.generatePrivate(keySpec);
        Signature signature = Signature.getInstance("MD5withRSA");
        signature.initSign(key);
        signature.update(data.getBytes());
        return new String(Base64.encodeBase64(signature.sign()));
    }

    /**
     * 147      * 验签
     * 148      *
     * 149      * @param srcData 原始字符串
     * 150      * @param publicKey 公钥
     * 151      * @param sign 签名
     * 152      * @return 是否验签通过
     * 153
     */
    public static boolean verify(String srcData, PublicKey publicKey, String sign) throws Exception {
        byte[] keyBytes = publicKey.getEncoded();
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PublicKey key = keyFactory.generatePublic(keySpec);
        Signature signature = Signature.getInstance("MD5withRSA");
        signature.initVerify(key);
        signature.update(srcData.getBytes());
        return signature.verify(Base64.decodeBase64(sign.getBytes()));
    }


    public static void main(String[] args) {
        try {

            // 生成密钥对

            KeyPair keyPaire = getKeyPaire();
            String privatekey = new String(Base64.encodeBase64(keyPaire.getPrivate().getEncoded()));
            String publickey = new String(Base64.encodeBase64(keyPaire.getPublic().getEncoded()));
            System.out.println("公钥：" + publickey);
            System.out.println("私钥：" + privatekey);
            // RSA加密
            String data = "待加密的文字内容";
            String encryptData = encrypt(data, getpublicKey(publickey));
            System.out.println("加密前的内容：" + data);
            System.out.println("加密后的内容：" + encryptData);
            // RSA解密
            String decryptData = decrypt(encryptData, getPrivateKey(privatekey));
            System.out.println("解密后的内容：" + decryptData);

            // RSA签名
            String sign = sign(data, getPrivateKey(privatekey));
            System.out.println("签名：" + sign);
            //RSA验签
            boolean verify = verify(data, getpublicKey(publickey), sign);
            System.out.println("验签结果为：" + verify);


        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("加解密异常");
        }


    }


}



