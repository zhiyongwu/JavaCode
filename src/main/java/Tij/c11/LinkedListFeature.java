package Tij.c11;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/8
 */
public class LinkedListFeature {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,3,2,3,4));

        System.out.println(list.pop());

        System.out.println(list);
    }
}
