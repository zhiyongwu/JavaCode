package JavaWeb.javanp;

import javax.xml.bind.DatatypeConverter;
import java.io.FileInputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;

/**
 * Created by Administrator on 2016/1/25.
 */
public class Test implements Runnable {
    private String filename;
    private byte[] digest;

    public Test(String filename) {
        this.filename = filename;
    }

    @Override
    public void run() {
        try {
            FileInputStream in = new FileInputStream(filename);
            MessageDigest sha = MessageDigest.getInstance("SHA-256");
            DigestInputStream din = new DigestInputStream(in, sha);
            while (din.read() != -1) ;
            din.close();
            digest = sha.digest();

//            StringBuilder result = new StringBuilder(filename);
//            result.append(": ");
//            result.append(DatatypeConverter.printHexBinary(digest));


        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public byte[] getDigest(){
        return digest;
    }

    public static void main(String[] args) {
        for (String filename : new String[]{"C:/Users/Admin/Desktop/rec.xls", "C:/Users/Admin/Desktop/seting.xml"}
                ) {
            Test t = new Test(filename);
            Thread t1 = new Thread(t);
            t1.start();

            byte[] digest = t.getDigest();
            StringBuilder result = new StringBuilder(filename);
            result.append(": ");
            result.append(DatatypeConverter.printHexBinary(digest));
            System.out.println(result);
        }
    }
}
