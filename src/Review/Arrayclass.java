package Review;
import java.util.Scanner;
public class Arrayclass {
    public static int[] CreatingArray(int number ){
        Scanner scan = new Scanner(System.in);
        int[] output = new int[number];
        for(int i =0; i<number; i++){
            output[i]=scan.nextInt();
        }
        return output;
    }

    public static void CreatingArray(int[] array){
        for(int i =0; i< array.length;i++){
            System.out.println("Elements "+(i+1)+": "+ array[i]);
        }
    }
    public static void main(String[] args) {
int[] a= CreatingArray(5);
        CreatingArray(a);
    }
}
