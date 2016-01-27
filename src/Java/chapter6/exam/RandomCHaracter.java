package Java.chapter6.exam;

/**
 * Created by Administrator on 2016/1/20.
 */
public class RandomCHaracter {

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }
    public static char getRandomLowerCaseLetter(){
        return getRandomCharacter('a','z');
    }
    public static char getRandomUpperCaseLetter(){
        return getRandomCharacter('A','Z');
    }
    public static char getRandomDigitCharacter(){
        return getRandomCharacter('0','9');
    }
    public static char getRandomCharacter(){
        return getRandomCharacter('\u0000','\uFFFF');
    }

}

class TestRandomCharacter{
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
//            char ch = Chapter6.exam.RandomCHaracter.getRandomLowerCaseLetter();
//            System.out.print(ch);
        }
    }
}
