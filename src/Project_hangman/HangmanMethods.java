package Project_hangman;

import java.util.Scanner;

public class HangmanMethods {
    public static String pickupWord(){
        String arr[] = {"Cucumber", "Internet","Programming","Selenium"};

        return arr[(int)(Math.random()*arr.length)];
    }

    public static void displayWord(String word) {
        Scanner scanner = new Scanner(System.in);
        String letter;
        int arr[]= new int[word.length()];
        while(true) {
            for (int i = 0; i < word.length(); i++) {
                if (arr[i] == 0) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" " + word.charAt(i) + " ");
                }
                System.out.print("  Type your letter : ");
                letter = scanner.nextLine();
                int index;


            }
        }
    }
}
