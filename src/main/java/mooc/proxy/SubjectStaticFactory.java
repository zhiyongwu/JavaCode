package mooc.proxy;

/**
 * Created by wuzhiyong on 2016/5/12
 */
public class SubjectStaticFactory {
    public static Subject getInstance() {
        return new ProxySubject(new RealSubject());
    }
}
