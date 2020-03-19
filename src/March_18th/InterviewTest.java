package March_18th;

public class InterviewTest {
    public static void main(String[] args) {
        Interview myinterview = new Interview("Orhan",100,50,300);

        System.out.println(myinterview.toString());

        myinterview.setSQL(10);
        myinterview.setJava(50);
        myinterview.setSoftSkills(70);
        myinterview.ScoreCalculation();
       myinterview.ReturnDecision();

    }
}
