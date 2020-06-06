package JetBrains;

import java.util.Arrays;
import java.util.Scanner;

public class ConcataneStrings {

    public static String concatenateStringsWithoutDigits(String[] strings) {
        // write your code with StringBuilder here
       String str = Arrays.toString(strings);
        String x = "";
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 65 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122)) {
                x += str.charAt(i);
            }
        }
        return x;
    }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] strings = scanner.nextLine().split("\\s+");
            String result = concatenateStringsWithoutDigits(strings);
            System.out.println(result);
        }

    }
