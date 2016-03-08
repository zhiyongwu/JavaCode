package Tij.c11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/8
 */
public class SimpleIteration {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
//        Iterator<Integer> it = list.iterator();
//        while (it.hasNext()){
//            Integer i = it.next();
//            System.out.println(i);
//        }
        for (Iterator it = list.iterator();it.hasNext();){
            System.out.println(it.next());
        }

    }
}
