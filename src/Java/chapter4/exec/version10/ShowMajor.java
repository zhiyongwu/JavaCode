package Java.chapter4.exec.version10;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/19.
 */
public class ShowMajor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String s = scanner.next();
        char ch1 = s.charAt(0);
        char ch2 = s.charAt(1);
        if(ch1 != 'M' && ch1 != 'C'){
            System.out.println("invalid input");
            System.exit(1);
        }
        if(ch2 < '1' || ch2 > '4'){
            System.out.println("Invalid input");
            System.exit(1);
        }
        String major = "";
        switch (ch1){
            case 'M':major = "Mathematics ";break;
            case 'C':major = "Computer Science ";break;
        }
        switch (ch2){
            case '1':major += "Freshman";break;
            case '2':major += "I don't know";break;
            case '3':major += "Junior";break;
            case '4':major += "I don't know";break;
        }
        System.out.println(major);
    }
}
