package parttendesign.proxy;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor.proxy
 * @date 2020/3/12 10:22
 * @Copyright © 2019
 */
public class TeacherProxy implements Teacher {

    private Teacher teacher;

    public TeacherProxy(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public void teche() {
        System.out.println("Wang is prepare for the class");
        teacher.teche();
        System.out.println("Class is over,go to home!");
    }
}
