package parttendesign.factory;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor.factory
 * @date 2020/3/16 17:36
 * @Copyright © 2019
 */
public class BeijingPapperPizza extends Pizza {
    @Override
    public void prepaer() {
        setName("北京胡椒pizza");
        System.out.println(getName()+":准备原材料");
    }
}
