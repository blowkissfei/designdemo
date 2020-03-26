package parttendesign.briger;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.briger
 * @date 2020/3/18 18:48
 * @Copyright © 2019
 */
public class PadPhone extends Phone {
    public PadPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("pad类型手机，你值得拥有");
    }
    public void close(){
        super.close();
        System.out.println("pad类型手机");
    }

    public void call(){
        super.call();
        System.out.println("pad类型手机，你值得拥有");
    }

}
