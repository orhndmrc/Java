package Collections;



import java.util.ArrayList;
import java.util.Arrays;

public class Derivative {
    public static void main(String[] args) {
        ArrayList<Integer> y=new ArrayList<Integer>(Arrays.asList(8,5,4,2,9));
        System.out.println(derivative(y));
        int arr[]={5,8,1,33,6,7,8};
        System.out.println((derivation(arr)));
    }
    public static ArrayList<Integer> derivative(ArrayList<Integer> x){
        ArrayList<Integer> mine=new ArrayList<Integer>();
        for(int i=0; i<x.size()-1;i++){
            mine.add(x.get(i)-x.get(i+1));
        }
        return mine;
    }
    public static ArrayList<Integer>  derivation(int[] k){
        ArrayList<Integer> empty=new ArrayList<Integer>();
        for(int i=0; i<k.length-1;i++){
          empty.add(k[i]-k[i+1]);
        }
        return empty;
    }
}
