package March_14th;

public class ArrayReview {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8};
        int[] array2={3,4,5,11,56,20};
        Intersection(array, array2);


    }
    public static void Intersection(int[] a, int[] b){
        for(int i=0;i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if(a[i]==b[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }
}
