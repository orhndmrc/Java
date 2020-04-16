package LinkList;

import java.util.Arrays;
import java.util.LinkedList;

public class LinklistLongestString {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>(Arrays.asList("Java","is","always","super","fun"));
        int longest=0;
        int index=0;
        for (int i = 0; i <myList.size() ; i++) {
            if(myList.get(i).length()>longest){
                longest=myList.get(i).length();
                index=i;
                System.out.println(myList.get(i));
            }
        }
        System.out.println("The longest word is : "+myList.get(index));
    }

}
class shortest{
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>(Arrays.asList("Java","is","always","super","fun"));
        int shortest=myList.get(0).length();
        int index=0;
        for (int i = 0; i <myList.size() ; i++) {
            if(myList.get(i).length()<shortest){
                shortest=myList.get(i).length();
                index=i;
                System.out.println(myList.get(i));
            }
        }
        System.out.println("The shortest word is : "+myList.get(index));
    }
    }



