package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveEvenLength {
    public static void main(String[] args) {
        ArrayList<String> test= new ArrayList<String>(Arrays.asList("Did", "you", "solve", "it", "or", "what?"));
        System.out.println(removeEvenLength(test));
    }
    public static ArrayList<String>  removeEvenLength(ArrayList<String> x){
        ArrayList<String> y= new ArrayList<String>();
        for(int i=0; i<x.size(); i++){
            String s = x.get(i);
            if(!(s.length()%2==0)){
                y.add(s);

            }
        }
        return y;
    }
}
