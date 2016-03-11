package Tij.c15.generic;

import java.util.ArrayList;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/11
 */
public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Long>().getClass();
        System.out.println(c1 + " " + c2 + " ");
        System.out.println(c1 == c2);
    }
}
