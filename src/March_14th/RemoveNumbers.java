package March_14th;
import java.util.*;
public class RemoveNumbers {
    public static void main(String[] args) {
        int myArray[] = {1,2,3,4,5,67,4,3,7,7};
        System.out.println(Arrays.toString(removeDuplicates(myArray)));
    }
    public static boolean isItInArray(int value,int[] arr){
        boolean result=false;
        for(int number:arr){
            if(number==value){
                result=true;
            }
        }
        return result;
    }

    public static int[] removeDuplicates(int[]arr){
        int[] removedDup = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(!isItInArray(arr[i],removedDup)){
                removedDup[i]=arr[i];

            }
        }
        return removedDup;
    }

}


