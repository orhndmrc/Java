package Feb_23rd;

public class BackwardString {
    public static void main(String[] args) {
        Backward("Orhan");
    }
    public static void Backward(String a){
        for(int i=a.length()-1;i>=0;i--){
            System.out.print(a.charAt(i));
        }
    }

}
