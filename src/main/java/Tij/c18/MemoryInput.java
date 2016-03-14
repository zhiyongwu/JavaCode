package Tij.c18;

import java.io.IOException;
import java.io.StringReader;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/14
 */
public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(new BufferedInputFile().read("./src/main/java/Tij/c18/BufferedInputFile.java"));
        int c;
        while ((c = in.read()) != -1){
            System.out.print((char)c);
        }
    }
}
