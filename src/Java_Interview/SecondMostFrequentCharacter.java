package Java_Interview;

public class SecondMostFrequentCharacter {
    public static void main(String[] args) {
        String str ="xxxxyyyz";
        int countermax=0; int countermedium=0; int countermin=0;
        int i=0;
        while( i<str.length()){
            if(str.charAt(i)=='x'){
                countermax++;
            }
            else if(str.charAt(i)=='y'){
                countermedium++;
            }
            else{
                countermin++;
            }
            i++;
        }
        if(countermax>countermin && countermax>countermedium && countermedium>countermin){
            System.out.println("Second repeating character is y ( "+countermedium+" times )");
        }
    }
}
