package Feb_29th;

public class lengthOfStringArray {
    public static void main(String[] args) {
        String[] array={"abc","defgh","qwerty","asd" };
        for(int i =0; i<array.length; i++){
            if(array[i].length()<4){
                System.out.println(array[i]);
            }
        }
        int counter=0;
        for(int i =0; i<array.length; i++){
            if(array[i].length()<4){
                counter++;
            }
        }
        System.out.println("The number of elements in the array: "+counter);
    }
}
