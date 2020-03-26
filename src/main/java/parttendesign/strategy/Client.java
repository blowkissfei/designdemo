package parttendesign.strategy;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor.strategy
 * @date 2020/3/10 15:00
 * @Copyright © 2019
 * @descreption 策略模式
 */
public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.display();
        wildDuck.fly();
        wildDuck.eat();
        System.out.println("=============");
        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.display();
        pekingDuck.fly();
        pekingDuck.eat();
        System.out.println("================");
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.display();
        toyDuck.fly();
        System.out.println("================");
        toyDuck.setFlyBehavier(new BadBehavier());
        toyDuck.display();
        toyDuck.fly();
        toyDuck.eat();
    }
}
