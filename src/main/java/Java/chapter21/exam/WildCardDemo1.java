package Java.chapter21.exam;

/**
 * Created by Administrator on 2016/1/28.
 */
public class WildCardDemo1 {
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(-2);
        System.out.println(max(intStack));
    }


    public static double max(GenericStack<? extends Number> stack){
        double max = stack.pop().doubleValue();
        while (!stack.isEmpty()){
            double value = stack.pop().doubleValue();
            if(value > max){
                max = value;
            }
        }
        return max;
    }
}
