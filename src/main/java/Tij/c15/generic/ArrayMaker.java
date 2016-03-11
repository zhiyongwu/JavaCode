package Tij.c15.generic;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/11
 */
public class ArrayMaker<T> {
    private Class<T> kind;

    public ArrayMaker(Class<T> kind) {
        this.kind = kind;
    }

    @SuppressWarnings("unchecked")
    T[] create(int size){
        return (T[]) Array.newInstance(kind,size);
    }

    public static void main(String[] args) {
        ArrayMaker<String> StringMaker = new ArrayMaker<>(String.class);
        String[] StrArray = StringMaker.create(9);
        System.out.println(Arrays.toString(StrArray));
    }
}
