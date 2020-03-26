package parttendesign.chin;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.chin
 * @date 2020/3/17 10:40
 * @Copyright © 2019
 */
public class Request {
    private int type = 0;
    private float price = 0.0f;
    private int id=0;

    public Request(int type, float price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
