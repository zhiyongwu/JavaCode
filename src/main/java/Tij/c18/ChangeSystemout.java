package Tij.c18;

import java.io.PrintWriter;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/14
 */
public class ChangeSystemout {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out,true);
        out.println("Hello ,World");
    }
}
