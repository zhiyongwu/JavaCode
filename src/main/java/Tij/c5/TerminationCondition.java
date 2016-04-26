package Tij.c5;

/**
 * Created by wuzhiyong on 2016/4/26
 */
public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        novel.checkIn();
        new Book(true);
        System.gc();
    }
}

class Book{
    boolean checkedOut = false;
    Book(boolean checkedOut){
        this.checkedOut = checkedOut;
    }

    void checkIn(){
        checkedOut = false;
    }

    @Override
    protected void finalize() throws Throwable {
        if(checkedOut){
            System.out.println("Error :Checked out");
        }
//        super.finalize();
    }
}
