package parttendesign.derecodter;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor
 * @date 2020/3/6 11:35
 * @Copyright © 2019
 */
public class Coffe extends Drink{


    @Override
    public float cost() {
        return super.getPrice();
    }

    /*public static void main(String[] args) {
        Coffe coffe = new Coffe();
        coffe.cost();
        System.out.println(coffe.des+":"+coffe.cost());
    }*/
}
