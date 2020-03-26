package parttendesign.factory;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.factory
 * @date 2020/3/16 19:57
 * @Copyright © 2019
 */
public class ShanghaiCheesePizza extends Pizza {
    @Override
    public void prepaer() {
        setName("上海奶酪pizza:");
        System.out.println(getName()+"准备原材料");
    }
}
