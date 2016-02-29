package Java.chapter3.exec;

/**
 * Created by Administrator on 2016/1/6.
 */
public class Exe3 {
    public static void main(String[] args) {
        System.out.println("1" + 1);  //11
        System.out.println('1' + 1);    //50
        System.out.println("1" + 1 + 1);    //12   //111
        System.out.println("1" + (1 + 1));  //12
        System.out.println('1' + 1 + 1);    //51
    }
}
