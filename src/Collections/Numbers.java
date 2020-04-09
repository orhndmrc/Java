package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Numbers {
    public static void main(String[] args) {
ArrayList<Integer> arr=new ArrayList<>();
    Random rnd = new Random();
        //System.out.println(rnd.nextInt(1000));
for(int i=1; i<=10; i++){
    arr.add(rnd.nextInt(1000));
}
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        //System.out.println( Collections.min(arr));
        System.out.println("Min number is : "+arr.get(0));
        System.out.println("Max number is : "+arr.get(arr.size()-1));
        System.out.println("Median number is : "+arr.get(arr.size()/2));
       // System.out.println( Collections.max(arr));
        ArrayList<Integer> largest=new ArrayList<>();
        largest.add(arr.get(arr.size()-1));
        largest.add(arr.get(arr.size()-2));
        largest.add(arr.get(arr.size()-3));
        System.out.println("Largest 3 numbers: "+largest);
        ArrayList<Integer> smallest=new ArrayList<>();
        smallest.add(arr.get(0));
        smallest.add(arr.get(1));
        smallest.add(arr.get(2));
        System.out.println("Smallest 3 numbers: "+smallest);
    }
}