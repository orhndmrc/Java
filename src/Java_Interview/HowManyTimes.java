package Java_Interview;

public class HowManyTimes {
    public static void main(String[] args) {

        String s = "Mississippi";
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
             if(s.charAt(i)==('i')){

            counter++;
       }
           }
        System.out.println("i is repeating "+counter+" times.");
    }
}