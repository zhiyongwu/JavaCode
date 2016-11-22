package Java.chapter5.overload;

/**
 * Created by wuzhiyong on 2016/11/22
 */
public class Book {
    boolean checkedOut;

    public Book(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public void checkIn() {
        this.checkedOut = false;
    }

    @Override
    protected void finalize() throws Throwable {
        if(checkedOut){
            System.out.println("error");
        }
        super.finalize();
    }

    public static void main(String[] args) {
        Book b = new Book(true);
        b.checkIn();
        new Book(true);
        System.gc();
    }
}
