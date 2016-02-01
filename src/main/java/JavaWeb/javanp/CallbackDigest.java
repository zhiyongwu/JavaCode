package JavaWeb.javanp;

import javax.xml.bind.DatatypeConverter;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Administrator on 2016/1/25.
 */
public class CallbackDigest implements Runnable{
    private String filemane;

    public CallbackDigest(String filemane){
        this.filemane = filemane;
    }

    @Override
    public void run() {
        try {
            FileInputStream in = new FileInputStream(filemane);
            MessageDigest sha = MessageDigest.getInstance("Sha-256");
            DigestInputStream din = new DigestInputStream(in,sha);
            while (din.read() != -1);
            din.close();
            byte[] digest = sha.digest();
            CallbackDigestUserInterface.receiveDigest(digest,filemane);
        }catch (IOException ex){
            ex.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}

