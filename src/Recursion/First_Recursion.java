package Recursion;

public class First_Recursion {
    public static void main(String[] args) {
        callMe(10);
    }
    public static void callMe(int count){
        System.out.println(count);
        if(count>0) {
            callMe(--count);
        }
    }
}
