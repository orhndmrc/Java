package Feb_23rd;
import java.util.Scanner;
public class Polindrome {



    public static void main(String[] args) {
        Polindrome("word");
    }

    public static void Polindrome(String word){
        System.out.println("Enter a text:");
        Scanner scanner = new Scanner(System.in);
        String input= scanner.next();
        for(int i=word.length()-1;i>=0;i--){
            System.out.print(word.charAt(i));
        }
        if(input.equals(word)){
            System.out.println("polindrome");
        }
        else{
            System.out.println("not a polindrome");
        }

    }
}
