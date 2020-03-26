package parttendesign.chin;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.chin
 * @date 2020/3/17 11:04
 * @Copyright © 2019
 */
public class Client {
    public static void main(String[] args) {
        Request request = new Request(25, 50000, 26);
        DepartmentApprove departmentApprove = new DepartmentApprove("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("王校长");
        SchoolMasterApprove schoolMasterApprove = new SchoolMasterApprove("李局长");
        PrizdentApprove prizdentApprove = new PrizdentApprove("邓县长");
        departmentApprove.setApprover(collegeApprover);
        collegeApprover.setApprover(schoolMasterApprove);
        schoolMasterApprove.setApprover(prizdentApprove);
        prizdentApprove.setApprover(departmentApprove);

        departmentApprove.proccessRequest(request);

    }
}
