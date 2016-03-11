package Tij.c15.generic;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/11
 */
public class ClassAsFactory{
    public static void main(String[] args) {
        A1<Employ> fe = new A1<>(Employ.class);


    }
}

class Employ{}
class A1<T>{
    T x;

    public A1(Class<T> kind) {
        try {
            x = kind.newInstance();
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }
}
