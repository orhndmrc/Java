package Java_Interview;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print(" Please enter a word : ");
        String str1=scanner.nextLine();
        String reversed="";
        for(int i= str1.length()-1; i>=0; i--){
           reversed+= str1.charAt(i);
        }
        System.out.println(reversed);
    }
}
