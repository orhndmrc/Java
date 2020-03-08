package March_8th;

import org.w3c.dom.ls.LSOutput;

public class WritingMethods {
    public static int add2int (int n , int m){
        int total = n + m;
        return total;
    }

    public static double add2double (double n , double m){
        double total = n + m;
        return total;
    }
 public static char add2char (char n , char m){
        char total =  (char)((int)n + (int)m );
        return total;
    }

    public static String add2String (String n , String m){
        String total = "" + n + m;
        return total;
    }

    public static void main(String[] args) {
        System.out.println(add2int (4,5));
        System.out.println(add2double(4.5,5.5));
        System.out.println(add2char ( '5', '6'));
        System.out.println(add2String ("Hello ", "World"));
    }
}
