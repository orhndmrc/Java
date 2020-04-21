package HashMap;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = new  LinkedList<Integer>();
       for(int i=0; i<50; i++){
           Collections.addAll(numbers,(int)(Math.random()*i*100+1));
       }
        System.out.println(numbers);
       Collections.sort(numbers);
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);
    }
}
