package Java.chapter21.exam;

import java.util.Date;

/**
 * Created by Administrator on 2016/1/28.
 */
public class WildCardDemo3 {
    public static <T> void add (GenericStack<T> stack1,GenericStack<? super T> stack2){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }

    public static void main(String[] args) {
        GenericStack<String > stack1 = new GenericStack<>();
        GenericStack<Object> stack2 = new GenericStack<>();

        stack1.push("Java");
        stack2.push(new Date());
        stack1.push("sun");

        add(stack1,stack2);

        WildCardDemo2.print(stack2);
    }
}
