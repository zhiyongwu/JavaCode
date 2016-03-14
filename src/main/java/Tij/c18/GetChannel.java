package Tij.c18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Map;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/14
 */
public class GetChannel {
    private static final int BSIZE = 1_024;

    public static void main(String[] args) throws IOException{
        FileChannel fc = new FileOutputStream("test.out").getChannel();
        fc.write(ByteBuffer.wrap("Some Text".getBytes()));
    }
}

class Test{
    public static void main(String[] args) {
        Map<String,Charset> m = Charset.availableCharsets();
        System.out.println(m.isEmpty());
        for (String key:m.keySet()
             ) {
            System.out.println(key + " : " + m.get(key));
        }
    }
}