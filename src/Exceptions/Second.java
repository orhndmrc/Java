package Exceptions;

public class Second {
    public static void main(String[] args) {
        try{
            System.out.println(4/0);
            System.out.println("code");//--->We can not see this part
        }
        catch (Exception e){
            System.out.println(e);
        }
        int i=50;
        int j=0;

        try{
            System.out.println(i/j);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(i/(j+2));
    }
}
