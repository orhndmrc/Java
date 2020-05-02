package Review;

import java.util.ArrayList;
import java.util.Arrays;

public class BankingAccount {
    public static void main(String[] args) {
        ArrayList<String> list = new   ArrayList<String>(Arrays.asList("four","score","and","seven","years","ago"));
        System.out.println(swapPairs(list));
    }
    public static ArrayList<String> swapPairs(ArrayList<String> list){


        for(int i=0; i<list.size()-1; i+=2){
            String str1=list.get(i+1);
            String str2=list.get(i);

          list.set(i,str1);
            list.set(i+1,str2);
        }
       return list;
    }
}

