package Feb_16th;

public class LoopContinued {
    public static void main(String[] args) {
        char letter='a';
        for(int i =1; i<=5; i++){
            System.out.print(i+"\t");
            for(int j =0; j<4; j++){

                System.out.print(letter+"\t");
                letter++;

            }
            System.out.println();
        }

    }
}
