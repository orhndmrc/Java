package Feb_26th;

public class invoices {
    public static void invoice(int a){
        int consumption=a;
        if(consumption>=500&&consumption<100){
            System.out.println("Good job!");
        }
        else if(consumption>=100&&consumption<1500){
            System.out.println("Not bad");
        }
        else{
            System.out.println("Start saving energy");
        }
    }
    public static void bill(int b) {
        int speed = b;
        if (speed > 100) {
            System.out.println("Good speed!");
        }
        else if (speed > 300){
            System.out.println("super speed");
        }
    }
        public static void main(String[] args){
            invoice(1200);
            bill(200);
        }


    }

