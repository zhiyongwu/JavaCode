package Tij.c7;

/**
 * Created by Administrator on 2016/1/26.
 */
public class Bath {
    private String s1 = "happy",s2 = "Happy",s3,s4;
    private Soap castille;
    private int i;
    private float toy;

    public Bath(){
        System.out.println("Inside Bath()");
        s3 = "joy";
        toy = 3.14f;
        castille = new Soap();
    }
    {i = 47; }

    @Override
    public String toString() {
        if(s4 == null)
            s4 = "joy";
        return "Bath{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", s3='" + s3 + '\'' +
                ", s4='" + s4 + '\'' +
                ", castille=" + castille +
                ", i=" + i +
                ", toy=" + toy +
                '}';
    }


    public static void main(String[] args) {
        Bath b = new Bath();
        System.out.println(b);
    }
}

class Soap{
    private String s;
    Soap(){
        System.out.println("Soap()");
        s = "constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}