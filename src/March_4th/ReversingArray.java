package March_4th;

import java.util.*;

public class ReversingArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println("Original array: "+ Arrays.toString(arr));
        for(int i=0; i<arr.length/2; i++){
            int temp =arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;

        }
        System.out.println("Reversed array: "+ Arrays.toString(arr));
    }
}
