package parttendesign.chin2;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.chin2
 * @date 2020/3/17 11:30
 * @Copyright © 2019
 */
public class Client {
    public static void main(String[] args) {
        GameRequest gameRequest = new GameRequest(1, 255, 50000);
        DengmengApprove dengmengApprove = new DengmengApprove("邓萌萌");
        DenghuiApprove denghuiApprove = new DenghuiApprove("邓卉");
        DengyanApprove dengyanApprove = new DengyanApprove("邓研");
        DengfeiwenApprove dengfeiwenApprove = new DengfeiwenApprove("邓飞文");
        dengmengApprove.setGameApprove(denghuiApprove);
        denghuiApprove.setGameApprove(dengyanApprove);
        dengyanApprove.setGameApprove(dengfeiwenApprove);
        dengfeiwenApprove.setGameApprove(dengmengApprove);
        dengmengApprove.gameProccess(gameRequest);

    }
}
