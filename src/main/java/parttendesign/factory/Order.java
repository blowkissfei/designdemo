package parttendesign.factory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.factory
 * @date 2020/3/16 17:47
 * @Copyright © 2019
 */
public class Order {
    AbstractFactroy abstractFactroy;

    public Order(AbstractFactroy abstractFactroy) {
        setAbstractFactroy(abstractFactroy);
    }

    public void setAbstractFactroy(AbstractFactroy abstractFactroy) {
        this.abstractFactroy = abstractFactroy;
        Pizza pizza=null;
        String odertype="";
        do {
            odertype=getOrderType();
            pizza = abstractFactroy.creatPizza(odertype);
            if (pizza!=null){
                pizza.prepaer();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购失败！");
                break;
            }
        }while (true);
    }

    private String getOrderType() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String line = bufferedReader.readLine();
            return line;

        }catch (Exception e){
            return null;
        }

    }
}
