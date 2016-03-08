package Tij.c14;

/**
 * Created by wuzhiyong on 16/3/8.
 */
public class SimpleProxyDemo {
    public static void consumer(Interface iface){
        iface.doSomething();
        iface.doSomethingElse("bonbo");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}
interface Interface{
    void doSomething();
    void doSomethingElse(String arg);
}
class RealObject implements Interface{

    @Override
    public void doSomething() {
        System.out.println("do something");
    }

    @Override
    public void doSomethingElse(String arg) {
        System.out.println("do something eles" + arg);
    }
}

class SimpleProxy implements Interface{
    private Interface proxied;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        System.out.println("Simple proxy do something");
        proxied.doSomething();
    }

    @Override
    public void doSomethingElse(String arg) {
        System.out.println("simple proxy do something else" + arg);
        proxied.doSomethingElse(arg);
    }
}