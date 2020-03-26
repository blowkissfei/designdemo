package parttendesign.bridge;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.bridge
 * @date 2020/3/19 10:22
 * @Copyright © 2019
 */
public class Vivo implements PhoneBrand {
    @Override
    public void open() {
        System.out.println("vivo开机");
    }

    @Override
    public void close() {
        System.out.println("vivo关机");
    }

    @Override
    public void call() {
        System.out.println("vivo打电话");
    }
}
