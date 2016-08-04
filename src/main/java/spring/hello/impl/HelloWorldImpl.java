package spring.hello.impl;

import spring.hello.HelloWorld;

/**
 * Created by wuzhiyong on 2016/8/4
 */
public class HelloWorldImpl extends HelloWorld{

    @Override
    public void printHello(String msg) {
        System.out.println("Hello : " + msg);
    }
}
