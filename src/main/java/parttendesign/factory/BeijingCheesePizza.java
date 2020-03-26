package parttendesign.factory;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor.factory
 * @date 2020/3/16 17:32
 * @Copyright © 2019
 */
public class BeijingCheesePizza extends Pizza {
    @Override
    public void prepaer() {
        setName("北京奶酪pizza");
        System.out.println(getName()+":准备原材料");
    }
}
