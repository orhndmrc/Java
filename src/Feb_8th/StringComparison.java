package Feb_8th;
import java.util.Scanner;
public class StringComparison {
    public static void main(String[] args) {
       // if(dataName.equals("your string here")){
        Scanner genderRev = new Scanner(System.in);
        System.out.println(" put the gender type:");
        String gender = genderRev.nextLine();
        if(gender.equals("M")){
            System.out.println("a lot in IT");
        }
        else if(gender.equals("F")){
            System.out.println("few in IT");
        }
        else{

        }
    }
}
