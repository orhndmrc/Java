package Review;

public class AverageArray {
    public static double Average(int[] array){
        int sum=0;
        for(int i =0; i<array.length; i++){
            sum +=array[i];
        }
return ((double)sum/array.length);
    }

    public static void main(String[] args) {
        int[] b={1,2,3,4};
        System.out.println("Find the average "+ Average(b));
    }
}
