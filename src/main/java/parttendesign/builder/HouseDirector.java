package parttendesign.builder;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.builder
 * @date 2020/3/17 17:50
 * @Copyright © 2019
 */
public class HouseDirector {
    HouseBuilder houseBuilder=null;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House houseConstructor(){
        houseBuilder.buildBaise();
        houseBuilder.buildWalls();
        houseBuilder.buildRoof();
        return houseBuilder.buildHouse();
    }

}
