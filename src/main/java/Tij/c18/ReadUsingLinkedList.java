package Tij.c18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/14
 */
public class ReadUsingLinkedList {
    public static List<String> read(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        List<String> l = new LinkedList<>();
        while ((s = in.readLine() ) != null){
            l.add(s);
        }
        return l;
    }

    public static void main(String[] args) throws IOException {
        List<String> l = read("./src/main/java/Tij/c18/BufferedInputFile.java");
        Collections.reverse(l);
        for (String s: l
             ) {
            System.out.println(s);
        }
    }
}
