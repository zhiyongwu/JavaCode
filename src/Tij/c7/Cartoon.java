package Tij.c7;

/**
 * Created by Administrator on 2016/1/26.
 */
public class Cartoon extends Drawing{
    public Cartoon(){
        System.out.println("Cartoon constructor.");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}
class Art{
    Art(){
        System.out.println("Art constructor.");
    }
}

class Drawing extends Art{
    Drawing(){
        System.out.println("Drawing constructor.");
    }
}
