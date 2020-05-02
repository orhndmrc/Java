package String;

public class DoubleLetters {
    public static void main(String[] args) {
       String x= "orange";
        System.out.println(doubleLetter(x));

    }
    public static boolean doubleLetter(String x){
        boolean isTrue = false;
        for(int i=0; i<x.length()-1; i++){
            if(x.charAt(i)==x.charAt(i+1)){
                isTrue = true;
            }
        }
        return isTrue;
    }
}
