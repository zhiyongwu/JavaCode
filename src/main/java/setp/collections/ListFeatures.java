package setp.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by wuzhiyong on 2016/6/24
 */
public class ListFeatures {
    static <T> void print(T x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        print("1: " + list);
        Integer i = 9;
        list.add(i);
        print("2: " + list);
        print("3: " + list.contains(i));
        list.remove(i);
        Integer n = list.get(2);
        print("4: " + n + list.indexOf(n));
        Integer h = new Integer(10);

    }
}

