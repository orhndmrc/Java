package March_1st;

public class Minvalue {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6,7,8,9,10,};

        System.out.println(minNum(array));
    }
    public static int minNum(int [] a){
        int min=a[0];

        for(int i =0;i<a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }

        return min;

    }
}
