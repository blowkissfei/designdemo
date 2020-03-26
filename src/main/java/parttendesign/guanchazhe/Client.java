package parttendesign.guanchazhe;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor.guanchazhe
 * @date 2020/3/9 17:53
 * @Copyright © 2019
 * @descreption 观察者模式
 */
public class Client {
    public static void main(String[] args) {
        WeatherDate weatherDate = new WeatherDate();
        Neteasy neteasy = new Neteasy();
        Baiduwan baiduwan = new Baiduwan();
        weatherDate.registerObserver(neteasy);
        weatherDate.registerObserver(baiduwan);
        weatherDate.setDate(10f,10f,10f);
    }
}
