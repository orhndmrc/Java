package Feb_5th;
import java.util.Scanner;

public class LogicalOperators {
    public static void main(String args[]){
        Scanner KeyWord = new Scanner(System.in);

        /* && = logical "and"
         || = "or"
         ! = "not"
         == --> "equal"
         */
//if(1!=0){
   // System.out.println("Yes1");}
/*char a = 'a';
char b = 'b';
if(b>a){
    System.out.println("yes");
    System.out.println("lin2");
}*/
int num ;
        System.out.println(" Enter the number:");
num = KeyWord.nextInt();

if(num%2==1){
    System.out.println("odd");
}

    }
}
