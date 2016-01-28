package Java.chapter21.exam;

/**
 * Created by Administrator on 2016/1/28.
 */
public class Max1 {
    public static <E extends Comparable<E>> E max1(E o1,E o2){
        if(o1.compareTo(o2) > 0){
            return o1;
        }
        else return o2;
    }
}

class Test2{

    public static void main(String[] args) {
        int x = Max1.max1(23,24);
        System.out.println(x);
    }
}
