package Feb_26th;

public class RandomLetters {
    public static void main(String[] args) {
        generateLetterPass(6);
    }
public static void generateLetterPass(int passLen){
        for(int i=0; i<passLen;i++){
            System.out.print((char)(97 + (int) (Math.random() * 26)));
        }
}

}
