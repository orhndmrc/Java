package InterviewQuestions;

public class Plindrome {
    public static void main(String[] args) {

        StringBuilder text = new StringBuilder("father");
        System.out.println(IsPolindrome(text));
    }
    public static boolean IsPolindrome(StringBuilder str){
        boolean x = true;
        StringBuilder reversed = str.reverse();
        for(int i=0; i<str.length();i++){
            if(str.equals(reversed)){
                return true;
            }
        }
        return x;
    }
}
