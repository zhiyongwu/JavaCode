package tij4.examples.chapter2.code;

/**
 * Created by wuzhiyong on 2016/6/29
 */
public class ShowProperties {
    /**
     * <pre>
     * 打印系统属性
     * <pre/>
     */
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}
