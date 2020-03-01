package March_1st;

public class RandomIntegerArray {
    public static void ArrayCreation(int x){
        int[] array= new int[x];
        for(int i =0;i<x;i++) {
            array[i] = (int) (1000 + (Math.random() * 4000));
        }
            for(int i =0; i<x; i++){
                System.out.println(array[i]);

        }
    }
    public static void main(String[] args) {
        ArrayCreation(5);

        }

    }

