package Chapter6.exam;

/**
 * Created by Administrator on 2016/1/20.
 */
public class TestReturnGradeMethod {
    public static void main(String[] args) {
        System.out.println("the level is " + getGrade(78.3));
    }

    public static char getGrade(double score) {
        if (score >= 90.0) return 'A';
        else if (score >= 80.0) return 'B';
        else if (score >= 70.0) return 'C';
        else if (score >= 60.0) return 'D';
        else return 'F';
    }
}
