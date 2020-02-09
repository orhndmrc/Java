package Feb_9th;

public class NestedIfStatements {
    /*if(condition){ // code to be executed
       if(nested condition){// code to be executed
       }
       }
     */
    public static void main(String[] args) {
       int x = 1;
       int y = -4;
        if(x==1){
            System.out.println("OK");
             if(y>0){
                 System.out.println("Hello");// this line belongs to the inner "if" statement
             }
            System.out.println("OK OK"); // this line belongs to the outer "if" statement
        }

    }
}
