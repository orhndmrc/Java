package Sorting_Algorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
    int [] a ={1,5,6,4,2};

        bubblesort(a);
    }
    public static void bubblesort(int[] a){
        int temp=0;
        for(int i =0; i<a.length; i++){
            for(int j =0; j<a.length-1; j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

}
