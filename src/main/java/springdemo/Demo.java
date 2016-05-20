package springdemo;

import mooc.reflect.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wuzhiyong on 2016/5/18
 */
public class Demo {
    public static void main(String[] args) {
        try {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
            Car c = ctx.getBean("car",Car.class);
            System.out.println(c.getClass().getClassLoader());
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
