package Java.chapter14.exam;

/**
 * Created by Administrator on 2016/1/27.
 */
public class Max {
    public static Comparable max(Comparable c1,Comparable c2){
        if(c1.compareTo(c2) > 0)return c1;
        else return c2;
    }
}

class Test{
    public static void main(String[] args) {
        System.out.println(Max.max("s","a"));
    }
}
