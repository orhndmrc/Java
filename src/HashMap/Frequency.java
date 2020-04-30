package HashMap;

import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        String text = "java is java and we love java";
       ArrayList<String> list = new ArrayList<>(Arrays.asList(text.split(" ")));
        HashMap<String,Integer> freq = new HashMap<>();
        for(String howmany : list){
            freq.put(howmany,Collections.frequency(list,howmany));
        }
        System.out.println(freq);
    }
}

