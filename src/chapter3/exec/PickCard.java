package chapter3.exec;

/**
 * Created by Administrator on 2016/1/12.
 */
public class PickCard {
    public static void main(String[] args) {
        int cardNum = (int)(Math.random()*13 + 1);
        int cardColor = (int)(Math.random()*4);
        String color = "";
        switch (cardColor){
            case 0:color = "Clubs";break;
            case 1:color = "Diamond";break;
            case 2:color = "Heart";break;
            case 4:color = "Spades";break;
        }

        String num = "";
        switch (cardNum){
            case 1 : num = "Ace";break;
            case 11 : num = "Jack";break;
            case 12 : num= "Queen";break;
            case 13 : num = "King";break;
            default:num = String.valueOf(cardNum);
        }
        System.out.println("The card you picked is " + num + " of " + color) ;
    }
}
