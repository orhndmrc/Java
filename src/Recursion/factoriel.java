package Recursion;

public class factoriel {
    public static void main(String[] args) {
        System.out.println(fact(50));
    }

    public static long fact(long number){
        if (number==1) return 1;
        return number * fact(number-1);
    }
}

