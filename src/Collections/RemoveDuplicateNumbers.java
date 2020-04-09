package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicateNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>( Arrays.asList(1,2,2,3,2,4));
        ArrayList<Integer > newList =new ArrayList<Integer>();
        for (int number:arr) {
            if(!newList.contains( number )){
                newList.add( number);
            }
        }
        System.out.println(newList);
    }
}
