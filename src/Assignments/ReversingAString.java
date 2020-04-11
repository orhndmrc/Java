package Assignments;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class ReversingAString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a text: ");
        String y=scanner.nextLine();
        StringBuilder text= new StringBuilder(y);
        System.out.println(text.reverse());
    }
}