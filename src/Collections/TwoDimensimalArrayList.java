package Collections;

import java.util.ArrayList;

public class TwoDimensimalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> first=new ArrayList<ArrayList<Integer>>(3);
        System.out.println(first);
        first.add(new ArrayList<>());
        first.add(new ArrayList<>());
        first.add(new ArrayList<>());
        System.out.println(first);
        first.get(0).add(10);
        System.out.println(first);
        for(int i=0; i<3;i++) {
            for (int j = 0;j < 4; j++) {
                first.get(i).add((int) Math.pow(j, 2));

            }
        }
        System.out.println(first);
    }
}
