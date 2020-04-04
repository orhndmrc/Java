package Assignments;

public class RemoveSpaces {
    public static void main(String[] args) {
        remove("Java is fun");
    }
    public static void remove(String text){
        for(int i=0; i<text.length(); i++){
            if(text.charAt(i)!=32){
                System.out.print(text.charAt(i));
            }
        }
    }
}
