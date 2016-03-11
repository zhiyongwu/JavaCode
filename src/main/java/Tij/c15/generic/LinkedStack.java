package Tij.c15.generic;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/11
 */
public class LinkedStack<T> {
    private static class Node<U> {
        U item;
        Node<U> next;
        Node()

        {
            item = null;
            next = null;
        }

        Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }

    }

    private Node<T> top = new Node<>();

    public void push(T item){
        top = new Node<>(item,top);
    }
    public T pop(){
        T result = top.item;
        if(!top.end()){
            top = top.next;
        }
        return result;
    }

}

class Test{
    public static void main(String[] args) {
        LinkedStack<String> l = new LinkedStack<>();
        for (String s:"this is test zzz".split(" ")
             ) {
            l.push(s);
        }
        String s;
        while ((s = l.pop()) !=null){
            System.out.println(s);
        }
    }
}
