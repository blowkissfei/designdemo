package parttendesign.chin2;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.chin2
 * @date 2020/3/17 11:28
 * @Copyright © 2019
 */
public class DengfeiwenApprove extends GameApprove {
    public DengfeiwenApprove(String name) {
        super(name);
    }

    @Override
    public void gameProccess(GameRequest gameRequest) {
        if (gameRequest.getPrice()>100000){
            System.out.println("编号为："+gameRequest.getId()+"被"+this.name+"：处理");
        }else {
            gameApprove.gameProccess(gameRequest);
        }
    }
}
