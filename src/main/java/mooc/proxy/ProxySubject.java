package mooc.proxy;

/**
 * Created by wuzhiyong on 2016/5/12
 */
public class ProxySubject implements Subject{
    private Subject proxied;
    public ProxySubject(Subject proxied){
        this.proxied = proxied;
    }
    @Override
    public void dosomething(String str) {
        proxied.dosomething(str);
    }
}
