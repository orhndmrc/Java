package Exceptions;

public class First {
    public static void main(String[] args) {
        int x= 10;
        int y=0;
        //System.out.println((x/y));
       // System.out.println("Can you see me");
        try{
            System.out.println((x/y));
        }
        catch(Exception e) {  //e---> an object of Exception class
            System.out.println(e);
        }
        String s= null;
        try{
            System.out.println(s.length());
        }
        catch (Exception e){
            System.out.println(e);
        }
        String a= "a";
        try{
            int number= Integer.parseInt(a);
        }
        catch (Exception e){
            System.out.println(e);
        }
        int numbers[]={1,2,3,4,5};
        try{
            System.out.println(numbers[77]);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("can you see me?");
    }
}
