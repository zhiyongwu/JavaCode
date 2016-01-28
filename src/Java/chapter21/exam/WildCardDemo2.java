package Java.chapter21.exam;

/**
 * Created by Administrator on 2016/1/28.
 */
public class WildCardDemo2 {
    public static void print(GenericStack<?> stack){
        while (!stack.isEmpty()){
            System.out.println(stack.pop() + "");
        }
    }

    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(-2);

        print(stack);
    }
}
