package HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class addAll {
    public static void main(String[] args) {
        List fruits = new ArrayList();
        Collections.addAll(fruits,"Apples","Oranges","Banana");
        fruits.forEach(System.out::println);

        List copy = new ArrayList(10);
        Collections.copy(copy,fruits);
        System.out.println(copy);
    }
}
