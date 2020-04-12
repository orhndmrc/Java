package Collections;

import java.util.ArrayList;

public class ArraytoArrayList {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(convert(array));
    }


    public static ArrayList<Integer> convert(int[] x) {
        ArrayList<Integer> mine = new ArrayList<>();
        for (int i = 0; i < x.length; i++) {
            mine.add(x[i]);
        }
        return mine;
    }
}