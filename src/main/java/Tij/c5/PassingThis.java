package Tij.c5;

/**
 * Created by wuzhiyong on 2016/4/26
 */
public class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}

class Apple{
    Apple getPeeled(){
        return Peeler.peel(this);
    }
}

class Peeler{
    static Apple peel(Apple apple){
        //remove peel
        return apple;
    }
}


class Person{
    void eat(Apple apple){
        Apple peeled = apple.getPeeled();
        System.out.println("yummy");
    }

}