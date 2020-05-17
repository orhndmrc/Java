package Review;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        String text = scanner.next();
         int n = scanner.nextInt();
         String str = "";
        String str2 = "";
        if(n>text.length()){
            System.out.println(text);
        }
        else {
            for (int i = 0; i < text.length(); i++) {
                str = text.substring(0, n);
                str2 = text.substring(n, text.length());
            }
            System.out.println(str2 + str);
        }

    }
}