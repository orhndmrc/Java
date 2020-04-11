package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>(Arrays.asList(2, -5, 4, -2));
        ArrayList<Integer> y = new ArrayList<>(Arrays.asList(6, 4, -5, -2));
        ArrayList<Integer> xy = new ArrayList<>();
        for (int i = 0; i < x.size(); i++) {

                xy.add((x.get(i)*y.get(i)));


            }
        System.out.println(xy);
    }
        }

