package parttendesign.builder;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.builder
 * @date 2020/3/17 17:45
 * @Copyright © 2019
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBaise() {
        System.out.println("给普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("给普通房子砌墙");
    }

    @Override
    public void buildRoof() {
        System.out.println("给普通房子封顶");
    }
}
