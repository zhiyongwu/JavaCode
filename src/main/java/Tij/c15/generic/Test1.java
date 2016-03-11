package Tij.c15.generic;

import Tij.c15.generic.gene.BasicGenerator;
import Tij.c15.generic.gene.Coffee;
import Tij.c15.generic.gene.Generator;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/11
 */
public class Test1 {
    private static Generator<Coffee> GENERATOR = BasicGenerator.create(Coffee.class);

    public static void main(String[] args) {
        System.out.println(GENERATOR.next());
    }
}
