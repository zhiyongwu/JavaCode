package spring.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.hello.bean.Customer;
import spring.hello.bean.CustomerService;
import spring.hello.bean.FileNameGenerator;

/**
 * Created by wuzhiyong on 2016/8/4
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("HelloContext.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        // obj.printHello("there");
        // CustomerBo c = context.getBean(CustomerBo.class);
        // ScheduleBo sc = (ScheduleBo) context.getBean("schedule");
        // c.printMsg("customer");
        // sc.printMsg("schedule");
        // OutputHelper helper1 = context.getBean(OutputHelper.class);
        // helper1.generator();
        // OutputHelperWithConDI helper2 = context.getBean(OutputHelperWithConDI.class);
        // helper2.generate();
//        FileNameGenerator generator = (FileNameGenerator) context.getBean("fileNameGenerator");
//        generator.generate();
//        Customer customer = context.getBean(Customer.class);
//        System.out.println(customer.toString());
//        CustomerService service1 = (CustomerService) context.getBean("customerService");
//        service1.setMessage("message1");
//        System.out.println(service1.getMessage());
//        CustomerService service2 = (CustomerService) context.getBean("customerService");
//        System.out.println(service2.getMessage());
    }
}
