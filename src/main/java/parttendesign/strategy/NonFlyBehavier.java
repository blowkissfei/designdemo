package parttendesign.strategy;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor.strategy
 * @date 2020/3/10 14:40
 * @Copyright © 2019
 */
public class NonFlyBehavier implements FlyBehavier{
    @Override
    public void fly() {
        System.out.println("this duck can not fly!");
    }
}
