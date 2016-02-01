package Java.chapter4.exam.version10;

/**
 * Created by Administrator on 2016/1/19.
 */
public class FormatDemo {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n","Degrees","Radians","Sine","Cosine","Tangent");
        int degrees = 30;
        double randians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n",degrees,randians,Math.sin(randians), Math.cos(randians), Math.tan(randians));
        degrees = 60;
        randians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n",degrees,randians,Math.sin(randians), Math.cos(randians), Math.tan(randians));

    }
}
