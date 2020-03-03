package March_2nd;

public class IntArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
            System.out.println(array[i]);
        }
        for (int number : array) {
            System.out.println(number);
        }
        String[] arrayString = new String[5];
        for(int i=0 ; i<arrayString.length;i++){
            arrayString[i]=generateRandomWord();
        }
        for(String word:arrayString){
            System.out.println(word);
        }

    }

    public static String generateRandomWord(){
        String word="";
        int wordLength= (int)(Math.random()*6+1);
        for(int i=0 ; i<wordLength;i++){
            word+=(char)((int)(Math.random()*26+97));
        }
        return word;
    }

}
