package parttendesign.strategy;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor.strategy
 * @date 2020/3/10 14:50
 * @Copyright © 2019
 */
public class WildDuck extends Duck{

    public WildDuck(){
        flyBehavier=new GoodBehavier();
        eattingBehaveri=new EatBannana();
    }

    @Override
    void display() {
        super.quack();
        super.swim();
        System.out.println("this is wildduck");
    }
}
