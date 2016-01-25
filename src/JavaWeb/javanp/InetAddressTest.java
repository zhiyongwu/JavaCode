package JavaWeb.javanp;

import java.net.InetAddress;

/**
 * Created by Administrator on 2016/1/25.
 */
public class InetAddressTest {
    public static void main(String[] args) throws Exception{
        InetAddress i = InetAddress.getByName("");
        InetAddress address = InetAddress.getLoopbackAddress();
        System.out.println(address);
//        System.out.println(i.getHostAddress());
    }
}
