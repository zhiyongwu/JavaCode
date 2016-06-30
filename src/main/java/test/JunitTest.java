package test;

import org.junit.*;

/**
 * Created by wuzhiyong on 2016/6/30
 */


public class JunitTest {
    @Before
    public void before(){
        System.out.println("before");
    }

    @org.junit.Test(timeout = 200L)
    public void test(){
        Test1 t = new Test1();
        t.setTemp(1);
        t.setTemp(95);
    }
    @After
    public void after(){
        System.out.println("after");
    }
}
