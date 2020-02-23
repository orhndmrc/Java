package Feb_23rd;

public class loopmethod {
    public static void Numbers(){
        for(int a=100;a<1000;a++){
            System.out.println(a);
        }
    }
    public static void ASCII(){
        for(char i=0;i<256;i++){
            System.out.println(i);
        }
    }
public static void UpperCase(){
        for(char k =97;k<=122;k++){
            System.out.println(k);
        }
}
    public static void LowerCase() {
        for (char l = 97; l <= 122; l++) {
            System.out.println(l);
        }
    }
    public static void main(String[] args) {
        Numbers();
        ASCII();
        UpperCase();
        LowerCase();
    }
}
