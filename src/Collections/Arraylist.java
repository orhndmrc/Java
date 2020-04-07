package Collections;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
      ArrayList <Integer> mylist= new ArrayList<Integer>();
      for(int i=0; i<1000; i++){
          mylist.add(i);
      }
        System.out.println(mylist);
        for(int numbers:mylist){
            System.out.print(numbers+" ");
        }
    }

}
