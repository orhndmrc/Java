package HashMap;

public class MaxMultiplication {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,2,4};
        maxMultiply( arr);
    }
    public static void maxMultiply(int[] arr){
        int max=0;
        for(int i=0; i<arr.length-1; i++){
           int x=arr[i]*arr[i+1];
            if(x>max){
                max=x;
            }
            System.out.println("Index "+i+"= "+arr[i]+" value "+arr[i+1]+" Multiplication is "+x);
        }
        System.out.println("Max multiplication is "+max);
    }
}
