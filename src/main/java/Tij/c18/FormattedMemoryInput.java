package Tij.c18;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/14
 */
public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new ByteArrayInputStream(BufferedInputFile.read("./src/main/java/Tij/c18/BufferedInputFile.java").getBytes()));
        try {
            while (true){
                System.out.print((char)in.readByte());
            }
        }catch (EOFException ex){
            System.out.println("End of Stream");
        }

    }
}
