package Queue_Stack;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_ {
    public static void main(String[] args) {
        Queue<Integer> mine = new LinkedList<Integer>();
        mine.add(1);
        mine.add(2);

        mine.add(3);
        mine.add(4);
        System.out.println(mine);
        System.out.println(mine.peek());
       mine.poll();
        System.out.println(mine);
    }
}
