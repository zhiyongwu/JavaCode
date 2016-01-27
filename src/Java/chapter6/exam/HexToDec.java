package Java.chapter6.exam;

/**
 * Created by Administrator on 2016/1/20.
 */
public class HexToDec {

    public static void main(String[] args) {

        System.out.println(hexToDecimal("19AD".toUpperCase()));
    }

    public static int hexToDecimal(String hex){
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(ch);
        }
        return  decimalValue;
    }
    
    public static int hexCharToDecimal(char ch){
        if(ch >= 'A' && ch <= 'F'){
            return ch + 10 -'A';
        }else return ch - '0';
    }
}
