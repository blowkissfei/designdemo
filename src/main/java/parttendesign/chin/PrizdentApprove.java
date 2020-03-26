package parttendesign.chin;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.chin
 * @date 2020/3/17 10:59
 * @Copyright © 2019
 */
public class PrizdentApprove extends Approver{
    public PrizdentApprove(String name) {
        super(name);
    }

    @Override
    public void proccessRequest(Request request) {
        if (request.getPrice()>20000&&request.getPrice()<=100000){
            System.out.println("请求编号为："+request.getId()+"被"+this.name+"处理");
        }else {
            approver.proccessRequest(request);
        }
    }
}
