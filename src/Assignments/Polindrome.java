package Assignments;

public class Polindrome {
    public static void main(String[] args) {
        polindrome("mum");
    }
    public static void polindrome(String str){
        StringBuilder sb= new StringBuilder(str );
        System.out.println(sb.reverse());
       String x=sb.toString();
        if(x.equals(sb.reverse().toString())){
            System.out.println("it is a polindrome");
        }
        else{
            System.out.println("not a polindrome");
        }
    }
}
