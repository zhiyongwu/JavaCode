package mooc.proxy;

/**
 * Created by wuzhiyong on 2016/5/12
 */
public class StaticProxy {
    public static void main(String[] args) {
        SubjectStaticFactory.getInstance().dosomething("");
    }
}
