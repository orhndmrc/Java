package Exceptions;
import java.util.Scanner;
public class NextLetter {
    public static void main(String[] args) {
        letters();
    }
    public static void letters(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter your text: ");
        String s=scan.nextLine();
      try{  for(int i=0; i<s.length(); i++) {
          char a=s.charAt(i);
          a++;
          System.out.print(a);
      }

        }
      catch (Exception e){
          System.out.println("not possible");
      }
    }
}
