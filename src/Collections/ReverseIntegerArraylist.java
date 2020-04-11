package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseIntegerArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> reversed= new ArrayList<>();
       // Collections.reverse(list);
        //System.out.println(list);
        for (int i=list.size()-1; i>=0 ;i--){
            reversed.add(list.get(i));
        }
        System.out.println(reversed);
    }
}
