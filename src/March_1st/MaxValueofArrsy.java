package March_1st;

public class MaxValueofArrsy {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6,7,8,9,10,};

        System.out.println(maxNum(array));
    }
    public static int maxNum(int [] a){
        int max=a[0];

        for(int i =0;i<a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

return max;

    }


}
