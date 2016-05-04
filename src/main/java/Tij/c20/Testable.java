package Tij.c20;

/**
 * Created by wuzhiyong on 2016/4/26
 */
public class Testable {
    public void execute(){
        System.out.println("Executing..");
    }
    @Test void testExecute(){
        execute();
    }
}
