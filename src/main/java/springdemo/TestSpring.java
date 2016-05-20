package springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.SocketUtils;

/**
 * Created by wuzhiyong on 2016/5/12
 */
public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Person p = context.getBean("person",Person.class);
        p.info();
        int n= SocketUtils.findAvailableTcpPort();
        System.out.println(n);
    }


    public void f(){

    }
}
