package parttendesign.bridge;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.bridge
 * @date 2020/3/19 10:28
 * @Copyright © 2019
 */
public class Client {
    public static void main(String[] args) {

        AbstractPhone foldersPhone = new FoldersPhone(new XiaoMi());
        foldersPhone.open();
        foldersPhone.call();
        foldersPhone.close();


    }
}
