package Tij.c15.generic;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/11
 */
public class Manipulation {

}

class HasF{
    public void f(){
        System.out.println("HasF.f()");
    }
}

class Manipulator<T extends HasF>{
    private T obj;

    public Manipulator(T obj) {
        this.obj = obj;
    }

    public void manipulate(){
        obj.f();
    }
}