package Feb_9th;
import java.util.Scanner;
public class NestedIfExample_2 {
    public static void main(String[] args) {
        Scanner ComputerSkills = new Scanner(System.in);
        System.out.println("Which computer skill?(Java,SQL or Cloud");
        String type = ComputerSkills.next();
        if(type.equalsIgnoreCase("Java")) {
            System.out.println("What is your java score(0-100)");
            int javaScore = ComputerSkills.nextInt();
            if (javaScore >= 80) {
                System.out.println("Nice job");
            } else  if (javaScore < 80) {
                System.out.println("needs to be improved");
            }

         else if (type.equalsIgnoreCase("SQL")) {
                System.out.println("What is your rank score(0-100)");
            int rankScore = ComputerSkills.nextInt();
            if (rankScore >= 50) {
                System.out.println("Nice job");
            } else if (rankScore < 50) {
                System.out.println("needs to be improved");
            }
            }
         else if (type.equalsIgnoreCase("Cloud")) {
                System.out.println("Cloud score");
            int CloudScore = ComputerSkills.nextInt();
            if (CloudScore >= 50) {
                System.out.println("Nice job");
            } else if (CloudScore < 50) {
                System.out.println("needs to be improved");
            }


            }
        }
        else{
            System.out.println("Please type Java/SQL or Cloud");
        }
    }
}
