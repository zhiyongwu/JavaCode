package Tij.c18;

import java.io.*;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/14
 */
public class Redirecting {
    public static void main(String[] args) throws IOException{
        PrintStream console = System.out;
        BufferedInputStream in = new BufferedInputStream(new FileInputStream("./src/main/java/Tij/c18/BufferedInputFile.java"));
        PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("test.out")));
        System.setIn(in);
        System.setOut(out);
        System.setErr(out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null){
            System.out.println(s);
        }
        out.close();
        System.setOut(console);
    }
}
