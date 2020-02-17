package Assignments;
import java.util.Scanner;
public class JobBoard {
    public static void main(String[] args) {
        Scanner jobboard = new Scanner(System.in);
        System.out.println("Put your type of java credential(entry(500),junior(1000), or senior(2000):");
        int Javascore= jobboard.nextInt();
        System.out.println("Enter your SQL values(100,200, or 300 only):");
        int SQLvalue = jobboard.nextInt();
        System.out.println("Enter your experience in IT:(1-10)");
        int experience = jobboard.nextInt();
        int score;
        score=(Javascore+SQLvalue)*experience;
        System.out.println("Your score\t"+score);
        if(score>10000){
            System.out.println("Offer $80000");
        }
        else if(score>=7000&&score<=10000){
            System.out.println("Offer $60000");
        }
        else if(score>=5000&&score<7000){
            System.out.println("Offer $40000");
        }
        else if(score>0&&score<5000){
            System.out.println("We will keep your resume");
        }
        else{
            System.out.println("Not a valid score");
        }
    }
}
