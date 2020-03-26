package parttendesign.strategy;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor.strategy
 * @date 2020/3/10 14:58
 * @Copyright © 2019
 */
public class ToyDuck extends Duck {
    public ToyDuck(){
        super.flyBehavier=new NonFlyBehavier();
        super.eattingBehaveri=new NonnEatting();
    }

    @Override
    void display() {
        System.out.println("this is a toy duck!");
    }
}
