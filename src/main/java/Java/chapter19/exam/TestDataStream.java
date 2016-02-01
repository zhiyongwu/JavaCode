package Java.chapter19.exam;

import java.io.*;

/**
 * Created by Administrator on 2016/1/27.
 */
public class TestDataStream {
    public static void main(String[] args) throws Exception{
        DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat",true));
        output.writeUTF("hahah");

    }

}
