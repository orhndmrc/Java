package Review;

//import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class fsdf {
    public static void main(String[] args) {
        ArrayList<Double> taxRates = new ArrayList<Double>(Arrays.asList(0.10, 0.15, 0.21, 0.28, 0.31));
        ArrayList<Integer> denominations = new ArrayList<Integer>(Arrays.asList(1, 5, 10, 25, 50, 100));
        System.out.println(denominations.get(0));
        System.out.println(denominations.get(denominations.size()-1));
      denominations.set(denominations.size()-1,-1);
        denominations.add(0,10);
    }

}





