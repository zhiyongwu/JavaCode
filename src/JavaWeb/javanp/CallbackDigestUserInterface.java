package JavaWeb.javanp;

import javax.xml.bind.DatatypeConverter;

/**
 * Created by Administrator on 2016/1/25.
 */
public class CallbackDigestUserInterface {
    public static void receiveDigest(byte[] digest,String name){
        StringBuilder result = new StringBuilder(name);
        result.append(": ");
        result.append(DatatypeConverter.printHexBinary(digest));
        System.out.println(result);
    }

    public static void main(String[] args) {
        for (String filename:new String[]{"C:/Users/Admin/Desktop/rec.xls","C:/Users/Admin/Desktop/seting.xml"}
                ) {
            CallbackDigest c = new CallbackDigest(filename);
            Thread t = new Thread(c);
            t.start();
        }
    }
}
