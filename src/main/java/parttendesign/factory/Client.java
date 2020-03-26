package parttendesign.factory;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.factory
 * @date 2020/3/16 19:43
 * @Copyright © 2019
 */
public class Client {
    public static void main(String[] args) {
//         new Order(new BeijingFactroy());
         new Order(new ShanghaiFactroy());
    }
}
