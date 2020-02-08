package Feb_eight;

public class LeapYear {
    public static void main(String[] args) {
        int year = 100;
        if(year%100==0){
            if(year%400==0){
                System.out.println("Leap");
            }
            else{
                System.out.println("Not");
            }
        }
        else {
            if(year%4==0){
                System.out.println("Leap");
            }
            else {
                System.out.println("Not leap year");
            }
        }
    }
}