package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Derivative {
    public static void main(String[] args) {
        ArrayList<Integer> y=new ArrayList<Integer>(Arrays.asList(8,5,4,2,9));
        System.out.println(derivative(y));
    }
    public static ArrayList<Integer> derivative(ArrayList<Integer> x){
        ArrayList<Integer> mine=new ArrayList<Integer>();
        for(int i=0; i<x.size()-1;i++){
            mine.add(x.get(i+1)-x.get(i));
        }
        return mine;
    }
}
