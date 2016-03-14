package Tij.c18;

import java.io.File;
import java.io.LineNumberReader;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/14
 */
public class MakeDirectories {
    public static void usage(){
        System.err.println("");
    }

    public static void fileData(File file){
        if(file.exists()){
            System.out.println("exists");
        }
        if(file.isFile()){
            System.out.println("is file");
        }
        else if(file.isDirectory()){
            System.out.println("is directory");
        }
    }

    public static void main(String[] args) {
        File f = new File(".");
        fileData(f);
    }
}
