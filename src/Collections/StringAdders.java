package Collections;

import java.util.ArrayList;

public class StringAdders {
    public static void main(String[] args) {
        String letters = "abcdefghijklmnoprstuvyz";
        ArrayList<String> words= new ArrayList<>();
        String word;
        for(int i=0; i<100; i++){
            word="";
            for(int j=0; j<5; j++){
                word+=letters.charAt((int)(Math.random()*letters.length()));
            }
            words.add(word);
        }
        System.out.println(words);
    }
}