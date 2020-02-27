package Feb_5th;

public class IfElse {
    public static void main(String[] args) {
       /* Syntax = if(condition){
       block of code to be executed if the condition is true
       }
                  else{
                  block of code to be executed if the condition is false
                  }
        */
        int degree = 56;

        if(degree<=32){
            System.out.println("it is cold outside");
        }
        else if(32<degree&&degree<= 75){
            System.out.println("Nice Weather");
        }
        else{
            System.out.println("too hot");
        }
    }
}
