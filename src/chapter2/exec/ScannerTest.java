package chapter2.exec;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Administrator on 2015/12/30.
 */
public class ScannerTest {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner s = new Scanner(new File("C:/Users/Admin/Desktop/11"));
        while (s.hasNextLine()){
            System.out.println(s.nextLine());

        }
    }
}
