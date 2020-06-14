import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StringReverseStack {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a text : ");
        String text = scan.nextLine();
        String[] arr = text.split("");
        System.out.println("String array is "+ Arrays.toString(arr));
        Stack<String> myStack = new Stack<String>();
        for (int i = 0; i <arr.length ; i++) {
            myStack.push(arr[i]);
        }
        String[] reversed = new String[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            reversed[i]=myStack.pop();
        }
        System.out.println("The reversed text array is "+Arrays.toString(reversed));
        String reversedText = "";
        for (int i = 0; i <reversed.length ; i++) {
            reversedText+=reversed[i]+"";
        }
        System.out.println(reversedText);
 }
}
