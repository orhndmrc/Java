package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveArray_ {
    public static void main(String[] args) {
        ArrayList<String> mine=new ArrayList<String>(Arrays.asList("abc","sdf","fgh","ert"));
        System.out.println(remove(mine));
    }
    public static ArrayList<String>  remove(ArrayList<String> x){
        ArrayList<String> mine=new ArrayList<String>();

        for(int i=0; i<x.size(); i++){
            if(!(x.get(i).contains("a")||x.get(i).contains("e")|| x.get(i).contains("i"))){
                mine.add(x.get(i));
            }
        }
        return mine;
    }
}
