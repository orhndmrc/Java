package HashMap;

import java.util.Arrays;
import java.util.LinkedList;

public class Binary {
    public static void main(String[] args) {
        LinkedList<Integer> x = new LinkedList<Integer>(Arrays.asList(1,0,1));
        System.out.println(x);
        System.out.println(Convert(x));
    }
    public static int Convert(LinkedList<Integer> x){
        int decimal = 0;
        for(int i=x.size()-1; i>=0; i--){
            decimal+=Math.pow(2,i)*x.get(i);
        }
        return decimal;
    }
}
