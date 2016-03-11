package Tij.c15.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/11
 */
public class ListOfGeneric<T> {
    private List<T> array = new ArrayList<>();

    public void add(T item) {
        array.add(item);
    }

    public T get(int index) {
        return array.get(index);
    }
}
