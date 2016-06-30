package tij4.exercise.chapter2;

import java.lang.annotation.Annotation;
import java.util.Arrays;

/**
 * Created by wuzhiyong on 2016/6/29
 */
public class Main {
    public static void main(String[] args) {
        Class cc = Test.class;
        Annotation[] as = cc.getAnnotations();

        Annotation ac = cc.getAnnotation(Name.class);


        System.out.println(ac);

    }
}
