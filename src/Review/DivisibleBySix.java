package Review;

import java.util.Arrays;
import java.util.Scanner;
public class DivisibleBySix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

       int [] numbers = new int[num1];
      for(int j=0 ; j<10 ; j++) {
          numbers[j]=(int)(Math.random()*100)+1;
      }
        System.out.println(Arrays.toString(numbers));
        int sum=0;
     for(int i=0; i<numbers.length; i++){
         if(numbers[i]%3==0 && numbers[i]%2==0 ){
             sum+=numbers[i];
         }
     }
        System.out.println(sum);
    }
}
