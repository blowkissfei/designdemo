package parttendesign.briger;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.briger
 * @date 2020/3/18 18:33
 * @Copyright © 2019
 */
public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    protected void open(){
        this.brand.open();
    }
    protected void close(){
        brand.close();
    }
    protected void call(){
        brand.call();
    }
}
