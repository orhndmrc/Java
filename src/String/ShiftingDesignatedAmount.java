package String;

import java.util.Scanner;

public class ShiftingDesignatedAmount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        int shifting = scan.nextInt();
        int [] arr2 = new int[size];
        for (int i = 0; i <arr.length ; i++) {
            if(shifting<= size){
                arr2[i+shifting%size]=arr[i];
            }
            else{
                arr2[(i+shifting-size)%size]=arr[i];
            }
        }
        for(int numbers:arr2){
            System.out.print(numbers+" ");
        }
    }
}
