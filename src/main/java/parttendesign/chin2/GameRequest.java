package parttendesign.chin2;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.chin2
 * @date 2020/3/17 11:16
 * @Copyright © 2019
 */
public class GameRequest {
    private int type = 0;
    private int id = 0;
    private float price = 0.0f;

    public GameRequest(int type, int id, float price) {
        this.type = type;
        this.id = id;
        this.price = price;
    }

    public int getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }
}
