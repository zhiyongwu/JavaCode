package Tij.c15.generic;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/11
 */
public class RandomList<T> {
    private Random rand = new Random(47);
    private ArrayList<T> list = new ArrayList<>();

    public void add(T item){
        list.add(item);
    }

    public T select(){
        return list.get(rand.nextInt(list.size()));
    }
}
