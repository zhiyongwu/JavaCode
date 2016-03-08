package Tij.c10;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/8
 */
public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size){items = new Object[size];}
    public void add(Object x){
        items[next++] = x;
    }

    private class SequenceSelector implements Selector{

        private int i = 0;
        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if(i < items.length) i++;
        }
    }

    public Selector selector(){
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence s = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            s.add(String.valueOf(i));
        }
        Selector selector = s.selector();
        while (!selector.end()){
            System.out.println(selector.current());
            selector.next();
        }
    }
}
