package parttendesign.derecodter;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor
 * @date 2020/3/6 12:07
 * @Copyright © 2019
 */
public class CoffeStore {

    public static void main(String[] args) {

        Drink cubaCoffe = new CubaCoffe();
        System.out.println(cubaCoffe.cost());
        System.out.println(cubaCoffe.getDes());
        System.out.println("===============");
        cubaCoffe = new Milk(cubaCoffe);
        System.out.println(cubaCoffe.cost());
        System.out.println(cubaCoffe.getDes());
    }

}
