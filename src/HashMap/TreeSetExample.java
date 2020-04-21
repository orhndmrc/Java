package HashMap;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(10);
        ts.add(15);
        ts.add(1);
        System.out.println(ts);
        Iterator<Integer> iter = ts.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
