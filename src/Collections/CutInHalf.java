package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CutInHalf {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> cutHalfInt(ArrayList<Integer> full) {

        ArrayList<Integer> half = new ArrayList<>();

        for (int i = 0; i < full.size() / 2; i++) {
            half.add(full.get(i));
        }

        return half;
    }

    public static ArrayList<String> cutHalfStr(ArrayList<String> full) {

        ArrayList<String> half = new ArrayList<>();

        for (int i = 0; i < full.size() / 2; i++) {
            half.add(full.get(i));
        }

        return half;

    }
}