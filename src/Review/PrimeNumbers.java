
package Review;

import static java.util.Arrays.sort;

public class PrimeNumbers {
    public static boolean Prime(int num){
        for(int i=2; i<num; i++){   // 2 is the smallest prime number
           if(num % i==0){
               return false;
           }
        }
        return true;
    }
    public static void main(String[] args) {
for(int i =2; i<100; i++){
    if(Prime(i)){
        System.out.println(i);
    }
}
if((true|false)^true){
    System.out.println("k");
}
else{
    System.out.println("x");
}
}}
