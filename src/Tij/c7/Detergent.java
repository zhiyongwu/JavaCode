package Tij.c7;

/**
 * Created by Administrator on 2016/1/26.
 */
public class Detergent extends Cleanser{
    @Override
    public void scrub() {
        append(" Detergent scrub()");
        super.scrub();
    }
    public void foam(){append(" foam()");}


    public static void main(String[] args) {
        Detergent d = new Detergent();
        d.scrub();
        System.out.println(d);
    }
}

class Cleanser{
    private String s = "Cleanser";
    public void append(String a){s += a;}
    public void dilute(){append(" dilute()");}
    public void apply(){append(" apply()");}
    public void scrub(){append(" scrub()");}

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {

    }
}
