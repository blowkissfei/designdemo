package parttendesign.adapter;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor.adapter
 * @date 2020/3/10 15:54
 * @Copyright © 2019
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
