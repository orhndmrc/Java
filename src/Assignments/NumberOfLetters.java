package Assignments;

public class NumberOfLetters {
    public static void main(String[] args) {
        countletters("34yuh56i io");
    }
    public static void countletters(String text){
        int counter=0;
        for(int i= 0; i<text.length();i++){
            if( (text.charAt(i)>=97 &&  text.charAt(i)<=122) || (text.charAt(i)>=65 && text.charAt(i)<=90)){
                counter++;

            }

        }
        System.out.println(counter);
    }
}
