package parttendesign.factory;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor.factory
 * @date 2020/3/16 17:35
 * @Copyright © 2019
 */
public class LondongPapperPizza extends Pizza {
    @Override
    public void prepaer() {
        setName("伦敦胡椒pizza");
        System.out.println(getName()+":准备原材料");
    }
}
