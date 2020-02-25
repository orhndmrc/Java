package Feb_23rd;

public class StringFromtoptobottom {
    public static void main(String[] args) {
        VerticalString("Hello");
    }
    public static void VerticalString (String a){
        for(int i =0; i<a.length();i++){
            System.out.println(a.charAt(i));
        }
    }
}



