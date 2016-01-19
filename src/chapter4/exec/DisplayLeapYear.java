package chapter4.exec;

/**
 * Created by Administrator on 2016/1/15.
 */
public class DisplayLeapYear {
    public boolean isLeapYear(int year){
        return year%4 == 0 && year %100 != 0 || year % 400 == 0 ? true:false;
    }

    public static void main(String[] args) {
        DisplayLeapYear s = new DisplayLeapYear();
        for (int i = 2001; i <= 2100; i++) {
            if (s.isLeapYear(i)){
                System.out.println(i);
            }
        }
    }
}
