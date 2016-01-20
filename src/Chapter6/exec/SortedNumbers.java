package Chapter6.exec;

/**
 * Created by Administrator on 2016/1/20.
 */
public class SortedNumbers {
    public static void displaySortedNumbers(double num1 ,double num2,double num3){
        if(num1 > num2){
            double temp = num1;
            num1 = num2;
            num2= temp;
        }
        if(num1 > num3){
            double temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if(num2 > num3){
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println(num1 + " " + num2 + " " + num3);
    }

    public static void main(String[] args) {
        displaySortedNumbers(11.2,9.8,29.7);
    }
}
