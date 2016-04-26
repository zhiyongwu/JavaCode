package Tij.c5;

/**
 * Created by wuzhiyong on 2016/4/26
 */
public class Flower {
    int petalCount = 5;
    String s = "initialValue";

    Flower(int petals){
        petalCount = petals;
        System.out.println("Constructor with int arg only petals = " + petals);
    }

    Flower(String ss){
        s = ss;
        System.out.println("Constructor with string arg only s = " + s);
    }

    Flower(String s,int petals){
        this(petals);
        this.s = s;
        System.out.println("String & int args");
    }

    Flower(){
        this("hi",47);
        System.out.println("default Constructor (no args)");
    }

    @Override
    public String toString() {
        return "Flower{" +
                "petalCount=" + petalCount +
                ", s='" + s + '\'' +
                '}';
    }


    public static void main(String[] args) {
        Flower x = new Flower();
        System.out.println(x);
    }
}
