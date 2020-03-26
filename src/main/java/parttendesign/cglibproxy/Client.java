package parttendesign.cglibproxy;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor.cglibproxy
 * @date 2020/3/12 11:27
 * @Copyright © 2019
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        TeacherDao proxyInstance = (TeacherDao) new CglibProxyFactory(teacherDao).getProxyInstance();
        proxyInstance.tech();
    }
}
