package parttendesign.briger;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.briger
 * @date 2020/3/18 18:37
 * @Copyright © 2019
 */
public class FolderdPhone extends Phone {
    public FolderdPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("折叠手机款式");
    }
    public void close(){
        super.close();
        System.out.println("折叠手机款式");
    }
    public void call(){
        super.call();
        System.out.println("折叠手机款式");
    }
}
