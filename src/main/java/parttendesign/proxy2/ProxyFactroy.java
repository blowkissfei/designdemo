package parttendesign.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor.proxy2
 * @date 2020/3/12 10:35
 * @Copyright © 2019
 */
public class ProxyFactroy {

    private Object object;

    public ProxyFactroy(Object object) {
        this.object = object;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("Mr deng is prepare class");
                        Object result = method.invoke(object, args);
                        System.out.println("class is over!");
                        return result;
                    }
                });
    }
}
