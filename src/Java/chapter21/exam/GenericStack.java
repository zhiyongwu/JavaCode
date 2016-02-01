package Java.chapter21.exam;

import Java.chapter6.exam.Array;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/1/28.
 */
public class GenericStack<E> {
    private ArrayList<E> list = new ArrayList<>();

    public int getSize(){
        return list.size();
    }

    public E peek(){
        return list.get(getSize() - 1);
    }

    public void push(E o){
        list.add(o);
    }

    public E pop(){
        E o = list.get(getSize() - 1);
        list.remove(o);
        return o;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }
}

class Test1{
    public static void main(String[] args) {
        GenericStack<GenericStack<ArrayList>>  stack = new GenericStack<>();

    }
}
