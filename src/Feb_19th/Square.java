package Feb_19th;

public class Square {
    public static void main(String[] args) {
        for(int i = 0; i<4;i++){
            for(int j =0; j<4; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        int k =0;

        while(k<5){
            int l =0;
            while(l<5){
                System.out.print("* ");
l++;
            }
            k++;
            System.out.println();
        }
    }
}
