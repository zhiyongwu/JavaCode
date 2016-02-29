package Java.chapter13.exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/27.
 */
public class FileNotFoundExceptionDemo {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File(""));
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
    }
}
