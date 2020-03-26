package parttendesign.factory;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.factory
 * @date 2020/3/16 17:44
 * @Copyright © 2019
 */
public class LondonFactory implements AbstractFactroy {
    @Override
    public Pizza creatPizza(String oderType) {
        Pizza pizza = null;
        if (oderType.equals("cheese")){
            pizza=new LondongCheesePizza();
        }else if (oderType.equals("papper")){
            pizza=new LondongPapperPizza();
        }
        return pizza;
    }
}
