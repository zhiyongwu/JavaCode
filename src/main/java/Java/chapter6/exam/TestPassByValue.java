package Java.chapter6.exam;

/**
 * Created by Administrator on 2016/1/20.
 */
public class TestPassByValue {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        System.out.println(num1 + " before " + num2);
        swap(num1,num2);
        System.out.println(num1 + " after swap " + num2 );
    }

    public static void swap(int n1,int n2){
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println(n1 + " in swap " + n2);
    }
}
