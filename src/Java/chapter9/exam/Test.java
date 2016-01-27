package Java.chapter9.exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/26.
 */
public class Test {
    public static void readData(){
        try {
            Scanner scanner = new Scanner(new File("files/data.txt"));
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readData();
    }
}
