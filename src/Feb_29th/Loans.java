package Feb_29th;

public class Loans { public static void main(String[] args) {
    System.out.println(calculateMortgage(2400,15));
    System.out.println(calculateCarInsurance(24000,36));
}

    public static int  calculateMortgage(int monthly,int mountNum){
        int totalAmount=350000;

        int restPayment = totalAmount - monthly*mountNum;
        return restPayment;

    }

    public static double calculateCarInsurance(int totalCarPrice,int monthNum){
        double result;
        int monthly = 230;
        result = (totalCarPrice/monthNum)*0.9-monthNum;
        return result;
    }

}
