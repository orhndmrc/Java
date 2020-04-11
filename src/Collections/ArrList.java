package Collections;

import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("Java");
        list.add("is");
        list.add("fun");
        System.out.println(list);
        list.set(0,"Phyton");
        System.out.println(list);

        String text= "Java is fun";
        ArrayList<Character> list2= new ArrayList<>();
        for(int i=0; i<text.length(); i++){
            list2.add(text.charAt(i));
        }
        System.out.println(list2);
    }
}
