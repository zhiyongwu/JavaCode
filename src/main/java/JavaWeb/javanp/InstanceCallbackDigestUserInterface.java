package JavaWeb.javanp;

import javax.xml.bind.DatatypeConverter;
import java.util.Arrays;

/**
 * Created by Administrator on 2016/1/25.
 */
public class InstanceCallbackDigestUserInterface {
    private String filename;
    private byte[] digest;

    public InstanceCallbackDigestUserInterface(String filename) {
        this.filename = filename;
    }

    public void calculateDigest(){
        InstanceCallbackDigest cb = new InstanceCallbackDigest(filename,this);
        Thread t = new Thread(cb);
        t.start();
    }

    void receiveDigest(byte[] digest){
        this.digest = digest;
        System.out.println(this);
    }

    @Override
    public String toString() {
        String result =  filename + ": ";
        if(digest != null){
            result += DatatypeConverter.printHexBinary(digest);
        }else {
            result += "digest not available";
        }
        return result;
    }
}
