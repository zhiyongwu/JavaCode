package Java.chapter10.exam;

/**
 * Created by Administrator on 2016/1/26.
 */
public class TestCourse {
}

class Course{
    private String name;
    private String[] students = new String[100];
    private static int numberOfStudents;
    public Course(String name){
        this.name = name;
    }
    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }


}