package Project_hangman;

public class Hangman {
    public static void main(String[] args) {
        String display = HangmanMethods.pickupWord();
        HangmanMethods.displayWord(display);
    }

}
