package Java.chapter5;

/**
 * Created by wuzhiyong on 2016/11/22
 */
public class Initialize {

    static int b = 1;

    private String a;
    {
        a = "1";
        System.out.println(this);
    }

    public Initialize() {
        System.out.println("in constructor");
    }

    static {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        try {
            int[] a = new int[]{1,2,3,4,5,6};
            for (int i = 0; i < 100; i++) {
                System.out.println(a[i]);
            }
        }catch (Throwable ex){
            ex.printStackTrace();
        }
    }
}
