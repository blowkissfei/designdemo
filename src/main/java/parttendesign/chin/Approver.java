package parttendesign.chin;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.chin
 * @date 2020/3/17 10:44
 * @Copyright © 2019
 */
public abstract class Approver {
    Approver approver;
    String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void proccessRequest(Request request);

}
