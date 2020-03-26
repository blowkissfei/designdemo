package parttendesign.chin2;

import parttendesign.chin.Approver;
import parttendesign.chin.Request;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.chin2
 * @date 2020/3/17 11:26
 * @Copyright © 2019
 */
public class DengyanApprove extends GameApprove {
    public DengyanApprove(String name) {
        super(name);
    }

    @Override
    public void gameProccess(GameRequest gameRequest) {
        if (gameRequest.getPrice() > 20000 && gameRequest.getPrice() <= 100000) {
            System.out.println("编号为：" + gameRequest.getId() + "被" + this.name + "：处理");
        } else {
            gameApprove.gameProccess(gameRequest);
        }
    }
}
