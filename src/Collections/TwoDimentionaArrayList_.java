package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoDimentionaArrayList_ {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> x= new ArrayList<ArrayList<Integer>>();
        int number=1;
        for(int i=0; i<=2; i++){
            x.add(new ArrayList<>());
            for(int j=0; j<5;j++){
                x.get(i).add(number);
                number++;
            }
        }
        System.out.println(x);
    }
}
