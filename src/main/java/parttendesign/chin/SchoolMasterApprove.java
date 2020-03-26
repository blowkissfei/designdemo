package parttendesign.chin;


/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.chin
 * @date 2020/3/17 10:57
 * @Copyright © 2019
 */
public class SchoolMasterApprove extends Approver {
    public SchoolMasterApprove(String name) {
        super(name);
    }

    @Override
    public void proccessRequest(Request request) {
        if (request.getPrice()>10000&&request.getPrice()<=20000){
            System.out.println("请求编号为："+request.getId()+"被"+this.name+"处理");
        }else {
            approver.proccessRequest(request);
        }
    }
}
