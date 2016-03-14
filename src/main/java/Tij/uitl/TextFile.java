package Tij.uitl;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/14
 */
public class TextFile extends ArrayList<String> {
    public static String read(String filename){
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(new FileReader(new File(filename).getAbsoluteFile()));
            try {
                String s;
                while ((s = in.readLine()) != null){
                    sb.append(s).append("\n");
                }
            }finally {
                in.close();
            }
        }catch (IOException ex){
            throw new RuntimeException(ex);
        }
        return sb.toString();
    }

    public static void write(String fileName,String text){
        try {
            PrintWriter out = new PrintWriter(new File(fileName).getAbsoluteFile());
            try {
                out.print(text);
            }finally {
                out.close();
            }
        }catch (IOException ex){
            throw new RuntimeException(ex);
        }
    }


    public TextFile(String fileName ,String splitter){
        super(Arrays.asList(read(fileName).split(splitter)));
        if(get(0).equals("")){
            remove(0);
        }
    }

    public TextFile(String fileName){
        this(fileName,"\n");
    }

    public void write(String fileName){
        try {
            PrintWriter out = new PrintWriter(new File(fileName).getAbsoluteFile());
            try {
                for (String item:this
                     ) {
                    out.println(item);
                }
            }finally {
                out.close();
            }
        }catch (IOException ex){
            throw new RuntimeException(ex);
        }
    }
}


class Test{
    public static void main(String[] args) {
        String file = TextFile.read("Data.txt");
        System.out.println(file);
        TextFile.write("Data.txt","this text");
    }
}