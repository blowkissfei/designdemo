package parttendesign.guanchazhe;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor.guanchazhe
 * @date 2020/3/9 17:32
 * @Copyright © 2019
 */
public class Neteasy implements ObserverFei {
    private float temp;
    private float preesure;
    private float humlity;

    @Override
    public void update(float temp, float preesure, float humlity) {
        this.temp=temp;
        this.preesure=preesure;
        this.humlity=humlity;
        display();
    }

    private void display() {
        System.out.println("NET EASY");
        System.out.println("***today temp is :"+temp+"***");
        System.out.println("***today preesure is :"+preesure+"***");
        System.out.println("***today humlity is :"+humlity+"***");

    }
}
