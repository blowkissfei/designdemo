package parttendesign.factory;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.factory
 * @date 2020/3/16 17:41
 * @Copyright © 2019
 */
public class BeijingFactroy implements AbstractFactroy {
    @Override
    public Pizza creatPizza(String oderType) {
        Pizza pizza = null;
        if (oderType.equals("cheese")){
            pizza=new BeijingCheesePizza();
        }else if (oderType.equals("papper")){
            pizza=new BeijingPapperPizza();
        }
        return pizza;
    }
}
