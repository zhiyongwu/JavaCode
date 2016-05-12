package mooc.proxy;

/**
 * Created by wuzhiyong on 2016/5/12
 */
public class RealSubject implements Subject{
    @Override
    public void dosomething(String str) {

        System.out.println("Call dosomething");
        System.out.println("RealSubject.dosomething");
    }
}
