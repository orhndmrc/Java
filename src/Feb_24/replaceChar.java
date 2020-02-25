package Feb_24;

public class replaceChar {
    public static void replaceChar(String text, char a, char b){
        String s ="";
        for(int i =0; i<text.length();i++){
            if(text.charAt(i)==a){
                System.out.print(b);
            }
            else{
                System.out.print(text.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        replaceChar("Hello",'o','a');
    }
}
