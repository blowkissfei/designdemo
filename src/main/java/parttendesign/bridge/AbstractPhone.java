package parttendesign.bridge;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.bridge
 * @date 2020/3/19 10:23
 * @Copyright © 2019
 */
public abstract class AbstractPhone {
    PhoneBrand phoneBrand;

    public AbstractPhone(PhoneBrand phoneBrand) {
        this.phoneBrand = phoneBrand;
    }

    public void setPhoneBrand(PhoneBrand phoneBrand) {
        this.phoneBrand = phoneBrand;
    }

    protected void open(){
        this.phoneBrand.open();
    }
    protected void close(){
        this.phoneBrand.close();
    }
    protected void call(){
        this.phoneBrand.call();
    }


}
