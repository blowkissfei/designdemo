package parttendesign.proxy2;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor.proxy2
 * @date 2020/3/12 10:49
 * @Copyright © 2019
 */
public class Client {
    public static void main(String[] args) {
        TeacherInterface teacherDeng = new TeacherDeng();
        TeacherInterface proxyFactroy = (TeacherInterface) new ProxyFactroy(teacherDeng).getProxyInstance();
        System.out.println("proxyFactroy:"+proxyFactroy.getClass());
        proxyFactroy.teacheClass();
    }

}
