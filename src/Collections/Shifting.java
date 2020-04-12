package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Shifting {
    public static void main(String[] args) {
        ArrayList<Integer> k= new  ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        System.out.println(shift( k,3));
    }
    public static ArrayList<Integer> shift( ArrayList<Integer> x, int y){
        ArrayList<Integer> mine= new  ArrayList<Integer>();
        for (int i= y; i<x.size();i++){
            mine.add(x.get(i));

        }

        return mine;
    }
}
