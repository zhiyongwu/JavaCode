package Tij.c5;

/**
 * Created by wuzhiyong on 2016/4/26
 */
public class ConstructorDemo {
    public static void main(String[] args) {
        new Test3();
        new Test3("sss");
        new Dog().bark();
        new Dog().bark("howling");
    }
}

class Test3 {
    Test3() {
        System.out.println("This is test3");
    }
    Test3(String s){
        System.out.println("This is test3 with String:" + s);
    }
}

class Dog{
    void bark(){
        System.out.println("barking");
    }

    void bark(String s){
        System.out.println(s);
    }
}