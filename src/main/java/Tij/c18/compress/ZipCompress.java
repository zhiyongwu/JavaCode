package Tij.c18.compress;

import java.io.*;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/14
 */
public class ZipCompress {
    public static void main(String[] args) throws IOException {
        String[] files = {"file.txt","Data.txt","test.out","test.gz","test.zip"};
        FileOutputStream f = new FileOutputStream("test.zip");
        CheckedOutputStream csum = new CheckedOutputStream(f,new CRC32());
        ZipOutputStream zos = new ZipOutputStream(csum);
        BufferedOutputStream out = new BufferedOutputStream(zos);
        zos.setComment("A test of java Zipping");
        for(String file : files){
            System.out.println(f);
            BufferedReader br = new BufferedReader(new FileReader(file));
            zos.putNextEntry(new ZipEntry(file));
            int c;
            while ((c = br.read()) != -1){
                out.write(c);
            }
            br.close();
            out.flush();
        }
        out.close();
    }
}
