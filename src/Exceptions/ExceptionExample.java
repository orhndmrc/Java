package Exceptions;

public class ExceptionExample {
    public static void main(String[] args) {

        try{
            int[] a= {1,2,3,4,5};
            System.out.println(a[6]);
        }
        catch(Exception e){
            System.out.println("Exception = "+e);
        }
        System.out.println("it is working");
    }
}
