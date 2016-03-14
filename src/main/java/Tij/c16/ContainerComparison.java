package Tij.c16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/11
 */
public class ContainerComparison {
    public static void main(String[] args) {
        BerylliumSphere[] spheres = new BerylliumSphere[10];
        for (int i = 0; i < 5; i++) {
            spheres[i] = new BerylliumSphere();
        }
        System.out.println(Arrays.toString(spheres));
        System.out.println(spheres[4]);
        List<BerylliumSphere> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new BerylliumSphere());

        }
        System.out.println(list);
        System.out.println(list.get(4));
        int[] ints = {1,2,3,4,5};
        System.out.println(Arrays.toString(ints));
        System.out.println(ints[4]);

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list1);
        System.out.println(list1.get(4));
    }
}

class BerylliumSphere {
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + id;
    }
}