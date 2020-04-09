package Review;

import java.util.*;

public class SwapPairs_ {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for (int i = 0; i < 9; i++) {
            numbers[i] = numbers[i + 1];
        }
        int[] numbers2 = {10, 40, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for (int i = 1; i < 10; i++) {
            numbers[i] = numbers[i - 1];
        }
        Arrays.sort(numbers2);
        System.out.println(numbers[2]);
        boolean b=true, t=true;
int y=20;
b=(y!=10)^(t=false);
        System.out.println(b);
    }
}