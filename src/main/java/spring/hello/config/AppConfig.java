package spring.hello.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import spring.hello.HelloWorld;
import spring.hello.impl.HelloWorldImpl;

/**
 * Created by wuzhiyong on 2016/8/4
 */
@Configuration
@Import({CustomerConfig.class, ScheduleConfig.class})
public class AppConfig {

    @Bean(name = "helloBean")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }
}
