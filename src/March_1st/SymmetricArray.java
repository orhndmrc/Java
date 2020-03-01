package March_1st;

public class SymmetricArray {
    public static void main(String[] args) {
        int[] symmetric={1,2,3,2,1};
        isSymmetric(symmetric);
    }
    public static void isSymmetric( int[] array){
        int index=array.length-1;
        int counter=0;
        for(int i=0; i<array.length;i++){
            if(array[i]!=array[index]){
                counter++;
            }
index--;
        }
        if(counter==0){
            System.out.println("Symmetric");
        }
        else{
            System.out.println("Not symmetric");
        }
    }
}
