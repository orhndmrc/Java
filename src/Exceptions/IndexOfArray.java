package Exceptions;
import java.util.Scanner;
public class IndexOfArray {
    public static void main(String[] args) {

        Array();
    }
    public static void Array(){
        String[][] arr={{"Java", "OOP","Abstraction"},{"Encapsulation", "Inheritance"},{"Interfaces"}};
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter index 1: ");
        int index1=scan.nextInt();
        System.out.print("Enter index 2: ");
        int index2=scan.nextInt();
       try{
           System.out.println(arr[index1][index2]);
       }

       catch (Exception e){
           System.out.println("invalid index");
       }

    }

}
