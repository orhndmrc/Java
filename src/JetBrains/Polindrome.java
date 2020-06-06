package JetBrains;

import java.util.Scanner;

public class Polindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        /*StringBuilder builder = new StringBuilder(text);
        StringBuilder reverse= builder.reverse();
        System.out.println(reverse);
        if(text.equals(reverse.toString())){
            System.out.println("yes");
        }
       else{
            System.out.println("no");
        }*/
        String x ="";
        for (int i = text.length()-1; i>=0 ; i--) {

            x+=text.charAt(i);

        }
        System.out.println(x);
        if(text.equals(x)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
