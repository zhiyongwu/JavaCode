package chapter3.exec;

import java.util.Scanner;

/**
 * Created by wuzhiyong on 16/1/10.
 */
public class SwitchCase {
    public static void switchcase(int i){
        switch (i){
            case 1:
                System.out.println("Jan");break;
            case 2:
                System.out.println("feb");break;
            case 3:
                System.out.println("mar");break;
            case 4:
                System.out.println("apr");break;
            case 5:
                System.out.println("may");break;
            case 6:
                System.out.println("jun");break;
            case 7:
                System.out.println("jul");break;
            case 8:
                System.out.println("aug");break;
            case 9:
                System.out.println("sep");break;
            case 10:
                System.out.println("oct");break;
            case 11:
                System.out.println("Nov");break;
            case 12:
                System.out.println("dec");break;
            default:
                System.out.println("Error number");
                System.exit(1);
        }
    }



    public static void daycalc(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the day in week");
        int i = scanner.nextInt();
        System.out.println("Enter days passed");
        int n = scanner.nextInt();

        int num = (i + n)%7;

        switch (num){
            case 0:
                System.out.println("sun");break;
            case 1:
                System.out.println("Mon");break;
            case 2:
                System.out.println("tue");break;
            case 3:
                System.out.println("thr");break;
            case 4:
                System.out.println("wed");break;
            case 5:
                System.out.println("fri");break;
            case 6:
                System.out.println("sat");break;
            default:
                System.out.println("wrong num");
        }
    }
    public static void main(String[] args) {
//            switchcase((int)(Math.random() * 12) + 1);
        daycalc();
    }
}
