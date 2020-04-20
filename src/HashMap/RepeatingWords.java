package HashMap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RepeatingWords {
    public static void main(String[] args) {
        ArrayList<String> newone= new ArrayList<>(Arrays.asList("Java","is","fun","Java"));
        String s="";
        for(int i=0; i<newone.size(); i++){
            s += newone.get(i)+" ";
        }
        System.out.println(s);
        System.out.println(findOccurrences(newone));
    }
    public static HashMap<String, Integer> findOccurrences(ArrayList<String> str) {
        HashMap<String, Integer> arr = new HashMap<>();
        for (String word : str) {
            if (arr.containsKey(word)) {
                arr.put(word, arr.get(word) + 1);
            } else {
                arr.put(word, 1);
            }
        }
        return arr;
    }
}
