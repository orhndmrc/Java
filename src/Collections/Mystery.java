package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Mystery {
    public static void main(String[] args) {
        ArrayList<Integer> k = new ArrayList<>(Arrays.asList(10,20,30,40));
        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(1,2,3,4,5, 6));
        ArrayList<Integer> m = new ArrayList<>(Arrays.asList(-1,3,28,17,9,33));
      //  mystery2(k);
      //  mystery2(l);
       // mystery2(m);
        mystery3(k);
        mystery3(l);
        mystery3(m);
    }
        public static void mystery2(ArrayList<Integer> list) {
            for (int i = list.size() - 1; i >= 0; i--) {
                if (i % 2 == 0) {
                    list.add(list.get(i));
                } else {
                    list.add(0, list.get(i));
                }
            }
            System.out.println(list);
        }
    public static void mystery3(ArrayList<Integer> list) {
        for (int i = list.size() - 2; i > 0; i--) {
            int a = list.get(i);
            int b = list.get(i + 1);
            list.set(i, a + b);
        }
        System.out.println(list);
    }
    }

