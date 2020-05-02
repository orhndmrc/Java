package String;

import java.util.ArrayList;
import java.util.Arrays;

public class Jackpot {
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<String>(Arrays.asList("b","a","a"));
        for(int i=0; i<x.size(); i++){

            if(x.indexOf(x.get(i))==-1){
                System.out.println("You win");
            }
            else{
                System.out.println("loser");
            }
        }
    }
}
