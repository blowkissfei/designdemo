package parttendesign.builder;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.builder
 * @date 2020/3/17 17:41
 * @Copyright © 2019
 */
public abstract class HouseBuilder {
    protected House house = new House();
    public abstract void buildBaise();
    public abstract void buildWalls();
    public abstract void buildRoof();

    public House buildHouse(){
        return house;
    }
}
