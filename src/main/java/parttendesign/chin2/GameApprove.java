package parttendesign.chin2;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.chin2
 * @date 2020/3/17 11:17
 * @Copyright © 2019
 */
public abstract class GameApprove {
    public GameApprove gameApprove;
    public String name;

    public GameApprove(String name) {
        this.name = name;
    }

    public void setGameApprove(GameApprove gameApprove) {
        this.gameApprove = gameApprove;
    }

    public abstract void gameProccess(GameRequest gameRequest);
}
