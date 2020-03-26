package parttendesign.briger;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.briger
 * @date 2020/3/18 18:31
 * @Copyright © 2019
 */
public class Vivo implements Brand{
    @Override
    public void open() {
        System.out.println("vivo卡机");
    }

    @Override
    public void close() {
        System.out.println("vivo关闭");
    }

    @Override
    public void call() {
        System.out.println("vivo打电话");
    }
}
