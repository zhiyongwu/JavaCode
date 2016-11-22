package Java.chapter9.interfaces;

/**
 * Created by wuzhiyong on 2016/11/22
 */
public class BStrategy implements Strategy {
    @Override
    public void doStrategy() {
        System.out.println("B strategy");
    }
}
