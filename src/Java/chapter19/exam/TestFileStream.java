package Java.chapter19.exam;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by Administrator on 2016/1/27.
 */
public class TestFileStream {
    public static void main(String[] args) throws Exception{
        FileOutputStream output = new FileOutputStream("temp.dat",true);//true
        for (int i = 0; i < 300; i++) {
            output.write(i);
        }

        output.close();

        FileInputStream input = new FileInputStream("temp.dat");
        int value;
        while ((value = input.read()) != -1){
            System.out.println((char)value);
        }
        input.close();
    }
}
