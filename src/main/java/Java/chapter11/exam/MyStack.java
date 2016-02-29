package Java.chapter11.exam;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/1/27.
 */
public class MyStack {
    ArrayList list = new ArrayList();
    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int getSize(){
        return list.size();
    }

    public Object peek(){
        return list.get(list.size() - 1);
    }

    public Object pop(){
        Object o = list.get(list.size() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o){
        list.add(o);
    }

    public int search(Object o){
        return list.lastIndexOf(o);
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}
