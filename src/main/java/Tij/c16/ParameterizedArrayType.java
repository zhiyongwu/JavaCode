package Tij.c16;

/**
 * Created by wuzhiyong on 16/3/12.
 */
public class ParameterizedArrayType {
    public static void main(String[] args) {

    }
}

class MethodParameter<T>{
    public T[] f(T[] arg){
        return arg;
    }

}
