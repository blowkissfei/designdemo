package parttendesign.strategy;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor.strategy
 * @date 2020/3/10 14:38
 * @Copyright © 2019
 */
public class GoodBehavier implements FlyBehavier{
    @Override
    public void fly() {
        System.out.println("this duck have a good fly pattern");
    }
}
