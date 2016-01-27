package JavaWeb.javanp;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Administrator on 2016/1/25.
 */
public class InstanceCallbackDigest implements Runnable{
    private String filename;
    private InstanceCallbackDigestUserInterface callback;

    public InstanceCallbackDigest(String filename, InstanceCallbackDigestUserInterface callback) {
        this.filename = filename;
        this.callback = callback;
    }

    @Override
    public void run() {
        try (FileInputStream in = new FileInputStream(filename)) {
            MessageDigest sha = MessageDigest.getInstance("ShA-256");
            DigestInputStream din = new DigestInputStream(in,sha);
            while (din.read() != -1);
            din.close();
            byte[] digest = sha.digest();
            callback.receiveDigest(digest);
        }catch (IOException ex){
            ex.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }




    public static void main(String[] args) {
        for (String filename:new String[]{"C:/Users/Admin/Desktop/rec.xls","C:/Users/Admin/Desktop/seting.xml"}
             ) {
            InstanceCallbackDigestUserInterface d = new InstanceCallbackDigestUserInterface(filename);
            d.calculateDigest();
        }
    }
}
