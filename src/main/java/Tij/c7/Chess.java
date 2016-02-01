package Tij.c7;

/**
 * Created by Administrator on 2016/1/26.
 */
public class Chess extends BoardGame{

    Chess(int i) {
        super(i);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess(0);
    }
}
class Game{
    Game(int i){
        System.out.println("Game constructor.");
    }
}

class BoardGame extends Game{

    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}
