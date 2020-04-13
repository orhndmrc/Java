package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class maxLength_ {
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<>(Arrays.asList("Java", "is", "fun"));
        System.out.println(maxLength(x));

    }
    public static int maxLength( ArrayList<String> text){
       int max = 0;
       for(int i=0; i<text.size();i++){
           String s= text.get(i);
           if(s.length()>max){
               max=s.length();

           }
       }

        return max;
    }
}
