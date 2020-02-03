
import java.util.Scanner;
public class ExampleKeyboard {
    public static void main(String args[]){
        Scanner readKeyword= new Scanner(System.in);
        System.out.print("Type a string :");
        String MyName;
        MyName= readKeyword.nextLine();

        System.out.println("My name is :"+MyName);
    }
}
