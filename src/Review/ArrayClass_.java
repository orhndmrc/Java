package Review;
import java.util.Scanner;
public class ArrayClass_ {
    public static int[] CreatingArray( int number){
        Scanner scanner = new Scanner(System.in);
       int[] output= new int[number];
       for(int i =0; i<number;i++ ){
           output[i]= scanner.nextInt();
       }
       return output;
    }
    public static  void ShowArray(int[] array ){
        for(int i =0; i<array.length; i++){
            System.out.println("Element "+(i+1)+ ": "+array[i]);
        }
    }
    public static void main(String[] args) {
int[] a= CreatingArray(5);
        ShowArray(a);
    }
}
