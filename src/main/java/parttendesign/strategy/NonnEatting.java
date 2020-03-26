package parttendesign.strategy;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor.strategy
 * @date 2020/3/10 15:09
 * @Copyright © 2019
 */
public class NonnEatting implements EattingBehaveri {
    @Override
    public void eat() {
        System.out.println("this duck can not eat!");
    }
}
