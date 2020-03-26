package parttendesign.bridge;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.bridge
 * @date 2020/3/19 10:26
 * @Copyright © 2019
 */
public class FoldersPhone extends AbstractPhone {
    public FoldersPhone(PhoneBrand phoneBrand) {
        super(phoneBrand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("this is a folder phone");

    }

    @Override
    protected void close() {
        super.close();
        System.out.println("this is a folder phone closed");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("this is a folder phone is calling");
    }
}
