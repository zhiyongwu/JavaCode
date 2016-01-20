package Chapter6.exec;

/**
 * Created by Administrator on 2016/1/20.
 */
public class PrintCharacter {

    public static void main(String[] args) {
        printChars('1','Z',10);

    }

    public static void printChars(char ch1 ,char ch2,int numberPerLine){
        int count = 0;
        if(ch1 > ch2){
            char temp = ch1;
            ch1 = ch2;
            ch2 = temp;
        }
        for (char ch = ch1;ch <= ch2;ch++){
            System.out.print(ch + " ");
            count++;
            if(count % numberPerLine == 0){
                System.out.println();
            }
        }
    }
}
