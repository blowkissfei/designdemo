package parttendesign.strategy;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor.strategy
 * @date 2020/3/10 14:55
 * @Copyright © 2019
 */
public class PekingDuck extends Duck {
    public PekingDuck(){
        super.flyBehavier=new BadBehavier();
        super.eattingBehaveri=new EatBug();
    }

    @Override
    void display() {
        super.quack();
        super.swim();
        System.out.println("this is pekingduck");
    }
}
