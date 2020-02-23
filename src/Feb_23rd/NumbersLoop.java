package Feb_23rd;

public class NumbersLoop {
    public static void main(String[] args) {
        Numbers();
    }
    public static void Numbers(){
        int x=1;
        for(int i =1;i<4;i++){
            for(int j =1;j<6;j++){
                System.out.print(x+"\t");
                x++;

            }
            System.out.println();

        }
    }
}
