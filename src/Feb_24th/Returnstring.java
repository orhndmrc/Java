package Feb_24th;

public class Returnstring {
    public static void returnString(String text, int start, int end){
        for(int i =start;i<=end;i++){
            String output="";

            System.out.print(text.charAt(i));
        }
    }

    public static void main(String[] args) {
        returnString("Helloworld",1,3);
    }
}
