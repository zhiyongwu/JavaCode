package spring.hello;

/**
 * a simple spring bean
 *
 * Created by wuzhiyong on 2016/8/4
 */
public class HelloWorld {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(String msg) {
        System.out.println("Spring hello : " + msg);
    }
}
