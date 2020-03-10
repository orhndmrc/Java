package Review;

public class Fibonacci_Numbers {
    public static void main(String[] args) {
     //Square numbers
int k=1;
        for (int i = 1; i <= 10; i++) {

            System.out.print(k*k + " ");
            k++;
        }
        System.out.println();
        
        //Fibonacci numbers

        int x = 1;
        int y = 1;

        for(int i = 1; i <= 6; i++) {
            System.out.print(x + " " + y + " ");
            x = x + y;
            y = x + y;
        }
        }
    }
