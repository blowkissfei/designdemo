package parttendesign.briger;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.briger
 * @date 2020/3/18 18:42
 * @Copyright © 2019
 */
public class Client {
    public static void main(String[] args) {

        Phone phone1 = new FolderdPhone(new XiaoMi());
        phone1.open();
        phone1.call();
        phone1.close();
        phone1.setBrand(new Vivo());
        System.out.println("===============");
        phone1.open();
        phone1.call();
        phone1.close();
        System.out.println("===============");
        Phone padPhone = new PadPhone(new Vivo());
        padPhone.open();
        padPhone.call();
        padPhone.close();
    }
}
