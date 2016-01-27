package Java.chapter11.exam;

/**
 * Created by Administrator on 2016/1/27.
 */
public class DynamicBindingDemo {
    public static void m(Object x){
        System.out.println(x);
    }

    public static void main(String[] args) {
        Object o = new Student();
        m(new Person());
        m(new Student());
        m(new GraduateStudent());
        m(new Object());
    }
}

class Person extends Object{
    @Override
    public String toString() {
        return "Person";
    }
}

class Student extends Person{
    void f(){}
    @Override
    public String toString() {
        return "Student";
    }
}

class GraduateStudent extends Student{
    @Override
    public String toString() {
        return "GraduateStudent";
    }
}
