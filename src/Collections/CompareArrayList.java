package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1= new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> list2= new ArrayList<>(Arrays.asList(4,5,6));
        System.out.println(combine(list1, list2));
      //list1.addAll(list2);
        //System.out.println(list1);

    }
    public static ArrayList<Integer> combine(ArrayList<Integer> list1 , ArrayList<Integer> list2){

        ArrayList<Integer> combine = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            combine.add(list1.get(i));
            combine.add(list2.get(i));
        }

        return combine;
    }
}
