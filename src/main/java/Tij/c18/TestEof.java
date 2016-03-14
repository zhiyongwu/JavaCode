package Tij.c18;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/14
 */
public class TestEof {
    public static void main(String[] args) throws IOException{
        DataInputStream in = new DataInputStream(new BufferedInputStream(
                new FileInputStream("./src/main/java/Tij/c18/BufferedInputFile.java")
        ));

        while (in.available() != 0){
            System.out.print((char)in.readByte());
        }
    }
}
