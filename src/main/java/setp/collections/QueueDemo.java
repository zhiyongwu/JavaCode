package setp.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by wuzhiyong on 2016/6/24
 */
public class QueueDemo {
    static void printQueue(Queue queue) {
        while (queue.peek() != null) {
            System.out.println(queue.remove() + " ");
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random ran = new Random();
        for (int i = 0; i < 10; i++) {
            queue.offer(ran.nextInt(1000));
        }
        printQueue(queue);
    }
}
