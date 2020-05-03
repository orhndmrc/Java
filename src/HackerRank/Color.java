package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;

public class Color {
    public static void main(String[] args) {



        ArrayList<String> arr= new ArrayList<>(Arrays.asList("redxxx","blueTimes","krfnf"));

        for(int i=0; i<arr.size(); i++){
            if(arr.get(i).contains("red")){
                System.out.println("red");
            }
            else if(arr.get(i).contains("blue")){
                System.out.println("blue");
            }
            else{
                System.out.println("");
            }
        }
    }
}
