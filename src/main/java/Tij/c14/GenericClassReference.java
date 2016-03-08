package Tij.c14;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/8
 */
public class GenericClassReference {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class;
        intClass = double.class;
        Class<?> c = Object.class;
    }
}
