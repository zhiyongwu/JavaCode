package Tij.c5;

/**
 * Created by wuzhiyong on 2016/4/26
 */
public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }
}

class Rock{
    Rock(){
        System.out.println("Rock ");
    }
}