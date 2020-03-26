package parttendesign.derecodter;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor
 * @date 2020/3/6 11:48
 * @Copyright © 2019
 */
public class Derecotor extends Drink {

    private Drink drink;

    public Derecotor(Drink drink){
        this.drink=drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        return super.getDes()+""+super.getPrice()+""+drink.getDes();
    }
}
