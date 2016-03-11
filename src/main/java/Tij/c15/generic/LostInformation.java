package Tij.c15.generic;

import java.util.*;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/11
 */
public class LostInformation {
    public static void main(String[] args) {
        List<A> list = new ArrayList<>();
        Map<A,B> map = new HashMap<>();
        C<B> c = new C<>();
        D<Long,Double> d = new D<>();
        System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(c.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(d.getClass().getTypeParameters()));
    }
}

class A{}
class B{}
class C<T>{}
class D<K,V>{}
