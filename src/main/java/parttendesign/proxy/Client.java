package parttendesign.proxy;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor.proxy
 * @date 2020/3/12 10:24
 * @Copyright © 2019
 */
public class Client {
    public static void main(String[] args) {
        TeacherWang teacherWang = new TeacherWang();
        TeacherProxy teacherProxy = new TeacherProxy(teacherWang);
        teacherProxy.teche();

    }
}
