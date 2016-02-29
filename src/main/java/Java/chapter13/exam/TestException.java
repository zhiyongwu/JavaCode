package Java.chapter13.exam;

/**
 * Created by Administrator on 2016/1/27.
 */
public class TestException {
    public static int sum(int[] list){
        int result = 0;
        for (int i = 0; i <=list.length ; i++) {//i < list.length
            result += list[i];
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            System.out.println(sum(new int[]{1,2,3,4,5}));
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("\n" + ex.getMessage());
            System.out.println("\n" + ex.toString());

            StackTraceElement[] elements = ex.getStackTrace();
            for (StackTraceElement element: elements
                 ) {
                System.out.println(element.getMethodName()+ " " + element.getClassName() + " " + element.getLineNumber());
            }
        }
    }
}
