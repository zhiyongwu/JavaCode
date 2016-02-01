package Java.chapter21.exam;

/**
 * Created by Administrator on 2016/1/28.
 */
public class GenericMethodDemo {
    public static <泛型> void print(泛型[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public static void main(String[] args) {
        GenericMethodDemo.print(new String[]{"2","3"});
        GenericMethodDemo.print(new Integer[]{1,2,3});
    }
}
