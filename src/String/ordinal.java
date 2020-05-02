package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ordinal {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(553, 34,21,69,22));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 10 == 1) {
                System.out.println(list.get(i) + "-ST");
            } else if (list.get(i) % 10 == 2) {
                System.out.println(list.get(i) + "-ND");
            } else if (list.get(i) % 10 == 3) {
                System.out.println(list.get(i) + "-RD");

            } else {
                System.out.println(list.get(i) + "-TH");

            }
        }
    }
}