package parttendesign.builder;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.builder
 * @date 2020/3/17 17:47
 * @Copyright © 2019
 */
public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBaise() {
        System.out.println("给高楼打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("给高楼砌墙");
    }

    @Override
    public void buildRoof() {
        System.out.println("给高楼封顶");
    }
}
