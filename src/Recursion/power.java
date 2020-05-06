package Recursion;

public class power {
    public static void main(String[] args) {
       System.out.println(power_(2,4));
    }
    public static double power_(int a, int b){
        if(b==0) return 1;

       return a*power_( a,  b-1);
    }
}
