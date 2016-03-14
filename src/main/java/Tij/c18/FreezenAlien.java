package Tij.c18;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/14
 */
public class FreezenAlien {
    public static void main(String[] args) throws Exception{
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("x.file"));
        Alien q = new Alien();
        out.writeObject(q);
    }
}
