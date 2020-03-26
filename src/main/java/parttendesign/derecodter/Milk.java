package parttendesign.derecodter;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor
 * @date 2020/3/6 11:59
 * @Copyright © 2019
 */
public class Milk extends Derecotor{
    public Milk(Drink drink) {
        super(drink);
        setDes("牛奶调料");
        setPrice(5.0f);
    }
}
