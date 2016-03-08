package Tij.c11;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/8
 */
public class ListIteration {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        ListIterator lit = list.listIterator();
        for (;lit.hasNext();){
            System.out.println(lit.next());
        }
        while (lit.hasPrevious()){
            System.out.println(lit.previous());
        }
    }
}
