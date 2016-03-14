package Tij.c18.compress;

import java.io.*;
import java.util.zip.GZIPOutputStream;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/14
 */
public class GZIPCompress {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("./src/main/java/Tij/c18/BufferedInputFile.java"));
        BufferedOutputStream bos = new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream("test.gz")));
        System.out.println("writing...");
        int c;
        while ((c = br.read()) != -1){
            bos.write(c);
        }
        br.close();
        bos.close();
        System.out.println("Finished");

    }
}
