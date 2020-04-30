package HashMap;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetReview {
    public static void main(String[] args) {
        String sentence = "java is java mum mum hey";
        String[] word = sentence.split(" ");
        HashSet<String> distinct = new HashSet<>();
        for(String words : word){
            distinct.add(words);
        }
        System.out.println(distinct);

    }
}
