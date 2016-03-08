package Cralwer.util;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/8
 */
public class BinaryUtil {
    //二进制转16进制，可读形式
    public static String binToHex(byte[] data) {
        StringBuilder result = new StringBuilder();
        int n = 0;
        for (byte b : data) {
            if (n % 16 == 0) {
                result.append(String.format("%05x: ", n));
            }
            result.append(String.format("%02x ", b));
            n++;
            if (n % 16 == 0) result.append("\n");
        }
        result.append("\n");
        return result.toString();
    }

}
