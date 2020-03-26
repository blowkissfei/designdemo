package parttendesign.builder;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.builder
 * @date 2020/3/17 17:55
 * @Copyright © 2019
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        houseDirector.houseConstructor();
        System.out.println("-------------------");
        HighBuilding highBuilding = new HighBuilding();
        houseDirector.setHouseBuilder(highBuilding);
        House house = houseDirector.houseConstructor();
        System.out.println(house);
    }
}
