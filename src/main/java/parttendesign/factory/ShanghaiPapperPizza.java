package parttendesign.factory;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.factory
 * @date 2020/3/16 19:58
 * @Copyright © 2019
 */
public class ShanghaiPapperPizza extends Pizza {
    @Override
    public void prepaer() {
        setName("上海胡椒pizza:");
        System.out.println(getName()+"准备原材料");
    }
}
