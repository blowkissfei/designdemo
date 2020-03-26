package parttendesign.derecodter;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign
 * @date 2020/3/6 11:26
 * @Copyright © 2019
 */
public abstract class Drink {

    public String des;
    private float price = 0.0f;
    public abstract float cost();
    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
