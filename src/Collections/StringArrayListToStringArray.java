package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class StringArrayListToStringArray {
    public static void main(String[] args) {
        ArrayList<String> y= new ArrayList<String>(Arrays.asList("Java ", "is ", "fun"));
        System.out.println(m(y));
    }
    public static String m(ArrayList<String> x){
        String array="";
        for(int i=0; i<x.size(); i++){
            array+=x.get(i);
        }
        return array;
    }
}
