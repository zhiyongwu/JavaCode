package Tij.c18;

import java.io.*;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/14
 */
public class BasicFileOutput {
    static String file = "./src/main/java/Tij/c18/BufferedInputFile.out";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("./src/main/java/Tij/c18/BufferedInputFile.java")));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        int lineCount = 1;
        String s;
        while ((s = in.readLine()) !=null){
            out.print(lineCount++ + " : " + s + "\n");
        }
        out.close();
        System.out.println(BufferedInputFile.read(file));
    }
}
