package Tij.c10;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/8
 */
public class Factories {
    public static void serviceConsumer(ServiceFactory fact){
        Service s = fact.getService();
        s.method2();
        s.method1();
    }

    public static void main(String[] args) {
        serviceConsumer(Imp1.factory);
        serviceConsumer(Imp2.factory);
    }
}

interface Service{
    void method1();
    void method2();
}

interface ServiceFactory {
    Service getService();
}

class Imp1 implements Service{
    @Override
    public void method1() {
        System.out.println("Imp1 method1");
    }

    @Override
    public void method2() {
        System.out.println("Imp1 method2");
    }

    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Imp1();
        }
    };
}

class Imp2 implements Service{

    @Override
    public void method1() {
        System.out.println("Imp2 method1");
    }

    @Override
    public void method2() {
        System.out.println("Imp2 method2");
    }

    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Imp2();
        }
    };
}