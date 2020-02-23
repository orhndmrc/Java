package Feb_22nd;

public class UpBackTriangle {
    public static void main(String[] args) {
        for(int i =20; i>0;i--){
            for(int j=0; j<(20-i);j++){
                System.out.print(" ");
            }
            for(int k=0; k<i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
