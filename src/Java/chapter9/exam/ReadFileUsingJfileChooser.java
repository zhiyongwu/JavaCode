package Java.chapter9.exam;

import javax.swing.*;
import java.io.File;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/1/26.
 */
public class ReadFileUsingJfileChooser {
    public static void main(String[] args) throws Exception{
        JFileChooser fileChooser = new JFileChooser();
        if(fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        }
        else System.out.println("No file selected");
    }
}
