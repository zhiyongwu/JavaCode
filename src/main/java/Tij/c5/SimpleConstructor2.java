package Tij.c5;

/**
 * Created by wuzhiyong on 2016/4/26
 */
public class SimpleConstructor2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock2(i);
        }
    }
}

class Rock2{
    Rock2(int i){
        System.out.println("ROck2 " + i);
    }
}
