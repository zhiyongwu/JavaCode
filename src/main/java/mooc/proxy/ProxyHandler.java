package mooc.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by wuzhiyong on 2016/5/12
 */
public class ProxyHandler implements InvocationHandler{
    private Object proxied;
    public ProxyHandler(Object proxied){
        this.proxied = proxied;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(proxied,args);
    }
}
