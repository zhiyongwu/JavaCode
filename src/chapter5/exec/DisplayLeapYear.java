package chapter5.exec;

/**
 * Created by Administrator on 2016/1/20.
 */
public class DisplayLeapYear {
    public static boolean isLeapYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i < 2100; i++) {
            if(isLeapYear(i)){
                count++;
                System.out.printf("%-6d",i);
                if(count % 10 == 0){
                    System.out.println();
                }
            }
        }

        System.out.println("\n" + count);
    }
}
