package parttendesign.bridge;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.bridge
 * @date 2020/3/19 10:20
 * @Copyright © 2019
 */
public class XiaoMi implements PhoneBrand {
    @Override
    public void open() {
        System.out.println("小米手机开机");
    }

    @Override
    public void close() {
        System.out.println("小米关机");
    }

    @Override
    public void call() {
        System.out.println("小米打电话");
    }
}
