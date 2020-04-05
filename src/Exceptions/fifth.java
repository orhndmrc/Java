package Exceptions;

public class fifth {
    public static void main(String[] args) {
        try{
            int a[]= new int[5];
            a[5]=5/0;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
        }
        catch(Exception e){
            System.out.println("Parent Exception");
        }
        System.out.println("code");
    }
}
