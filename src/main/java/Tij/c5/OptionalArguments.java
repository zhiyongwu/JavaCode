package Tij.c5;

/**
 * Created by wuzhiyong on 2016/5/4
 */
public class OptionalArguments {
    public static void main(String[] args) {
        char[] chs = "demo".toCharArray();
        new OptionalArguments().printArray(chs);
    }
    void printArray(Object... objects){
        for (Object obj:objects
             ) {
            System.out.println("obj = " + obj);
        }
    }
}
