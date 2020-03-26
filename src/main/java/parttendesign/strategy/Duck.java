package parttendesign.strategy;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor.strategy
 * @date 2020/3/10 14:42
 * @Copyright © 2019
 */
public abstract class Duck {

    public FlyBehavier flyBehavier;
    public EattingBehaveri eattingBehaveri;

    public Duck (){};
    abstract void display();
    public void quack(){
        System.out.println("duck is gaga bark");
    }
    public void swim(){
        System.out.println("duck is swimming");
    }
    public void fly(){
        if (flyBehavier!=null){
            flyBehavier.fly();
        }
    }
    public void eat(){
        if (eattingBehaveri!=null){
            eattingBehaveri.eat();
        }
    }

    public void setFlyBehavier(FlyBehavier flyBehavier) {
        this.flyBehavier = flyBehavier;
    }

    public void setEattingBehaveri(EattingBehaveri eattingBehaveri) {
        this.eattingBehaveri = eattingBehaveri;
    }
}
