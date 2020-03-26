package parttendesign.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor.cglibproxy
 * @date 2020/3/12 11:17
 * @Copyright © 2019
 */
public class CglibProxyFactory implements MethodInterceptor {
    private Object object;

    public CglibProxyFactory(Object object) {
        this.object = object;
    }

    public Object getProxyInstance(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(object.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理开始。。");
        Object result = method.invoke(object, objects);
        System.out.println("cglib代理提交");
        return result;
    }
}
