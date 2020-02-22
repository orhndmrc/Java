package Assignments;
import java.util.Scanner;
public class SwitchHomework {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your score");
        double score=scanner.nextDouble();
        int switchscore= (int)(score/10);
        System.out.println("Switch score= "+switchscore);

        switch(switchscore){
            case 9:
                System.out.println("A+");//90-100
                break;
            case 8:
                System.out.println("A");//80-89
                break;
            case 7:
                System.out.println("B");//70-79
                break;
            case 6:
                System.out.println("C");//60-69
                break;
            case 5:
                System.out.println("D");//50-59
                break;
            case 4://40-49
            case 3://30-39
            case 2://20-29
            case 1://10-19
            case 0://0-9
                System.out.println("Fail");
                break;
            default:
                System.out.println("Please enter a valid grade");
                break;
        }
    }
}
