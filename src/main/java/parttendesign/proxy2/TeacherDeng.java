package parttendesign.proxy2;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor.proxy2
 * @date 2020/3/12 10:34
 * @Copyright © 2019
 */
public class TeacherDeng implements TeacherInterface {
    @Override
    public void teacheClass() {
        System.out.println("Mr deng is on the class ");
    }
}
