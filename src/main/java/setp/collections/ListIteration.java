package setp.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by wuzhiyong on 2016/6/24
 */
public class ListIteration {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        ListIterator it = list.listIterator();
        while (it.hasNext()){
            System.out.println(it.next() + " " + it.nextIndex());
        }

        while (it.hasPrevious()){
            System.out.println(it.previous() + " " + it.previousIndex());
        }
    }
}
