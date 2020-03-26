package parttendesign.chin2;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.chin2
 * @date 2020/3/17 11:25
 * @Copyright © 2019
 */
public class DenghuiApprove extends GameApprove {
    public DenghuiApprove(String name) {
        super(name);
    }

    @Override
    public void gameProccess(GameRequest gameRequest) {
        if (gameRequest.getPrice() > 5000 && gameRequest.getPrice() <= 20000) {
            System.out.println("编号为：" + gameRequest.getId() + "被" + this.name + "：处理");
        } else {
            gameApprove.gameProccess(gameRequest);
        }
    }
}
