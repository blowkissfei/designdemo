package parttendesign.factory;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.factory
 * @date 2020/3/16 20:00
 * @Copyright © 2019
 */
public class ShanghaiFactroy implements AbstractFactroy {
    @Override
    public Pizza creatPizza(String oderType) {
        Pizza pizza=null;
        if (oderType.equals("cheese")){
            pizza=new ShanghaiCheesePizza();
        }else if (oderType.equals("papper")){
            pizza=new ShanghaiPapperPizza();
        }
        return pizza;
    }
}
