package March_22nd;

public class BankTest {
    public static void main(String[] args) {
        Bank myBank= new Bank(111,"saving", 1500);
        Loan myloan = new Loan(2445, "new loan", 4000, 0.04,12,1200);
       Loan myCarLoan= new CarLoan(1134, "car", 3000, 1.04, 72, 40000, 2.5,720);

    }
}
