package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>( Arrays.asList("A","A","B","C","D","C"));
        ArrayList<String > newList =new ArrayList<>();
        for (String word:arr) {
            if(!newList.contains( word )){
                newList.add( word );
            }
        }
        System.out.println(newList);
    }
}
