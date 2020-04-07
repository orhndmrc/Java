package Review;

import org.w3c.dom.ls.LSOutput;

public class countStringArray {
    public static void main(String[] args) {
        String[] str= {"banana","pear","strawberry","apple","apple"};
        System.out.println(countStrings(str, "k"));
    }
    public static int countStrings(String[] arr, String target){
        int counter=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(target)){
                counter++;
            }

        }

        return counter;
    }
}
