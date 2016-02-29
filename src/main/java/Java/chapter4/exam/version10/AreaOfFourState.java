package Java.chapter4.exam.version10;

/**
 * Created by Administrator on 2016/1/19.
 */
public class AreaOfFourState {
    public static void main(String[] args) {
        double x1 = 33.76055598473672;
        double y1 =-84.37034419351805;
        double x2 = 28.5383355;
        double y2 = -81.37923649999999;
        double x3 = 32.0835407;
        double y3 = -81.09983419999998;
        double x4 = 35.2270869;
        double y4 = -80.84312669999997;

        double s1 = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        double s2 = Math.sqrt(Math.pow(x2-x3,2)+ Math.pow(y2-y3,2));
        double s3 = Math.sqrt(Math.pow(x3-x4,2)+ Math.pow(y3-y4,2));
        double s4 = Math.sqrt(Math.pow(x1-x4,2)+Math.pow(y1-y4,2));

        double s13 = Math.sqrt(Math.pow(x1-x3,2) + Math.pow(y1-y3,2));


        double p1 = (s1 + s2 +s13)/2;
        double area1 = Math.sqrt(p1*(p1-s1)*(p1-s2)*(p1-s13));
        double p2 = (s3 + s4 + s13)/2;
        double area2 = Math.sqrt(p2*(p2-s3)*(p2-s4)*(p2-s13));
        System.out.println(area1+area2);
    }
}
