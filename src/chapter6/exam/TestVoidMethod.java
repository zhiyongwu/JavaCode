package Chapter6.exam;

/**
 * Created by Administrator on 2016/1/20.
 */
public class TestVoidMethod {

    public static void main(String[] args) {
        printGrade(75);
    }

    public static void printGrade(double score) {
        if (score >= 90.0) {
            System.out.println('A');
        } else if (score >= 80.0) {
            System.out.println('B');
        } else if (score >= 70.0) {
            System.out.println('C');
        } else if (score >= 60.0) {
            System.out.println('D');
        } else System.out.println('F');
    }
}
