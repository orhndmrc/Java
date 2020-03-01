package March_1st;

public class MergingArrays {
    public static void MergeArrays(int a[], int b[]) {
        //int [] a={1,2,3}; int[] b={4,5,6};
        int[] mergedArray= new int[a.length+b.length];
        for(int i =0;i<a.length;i++){
            mergedArray[i]=a[i];
        }
        int index=0;
        for(int j =a.length;j<mergedArray.length;j++){
            mergedArray[j]=b[index];
            index++;
        }

        for(int k =0;k<mergedArray.length;k++){
            System.out.println(mergedArray[k]);
        }

    }

    public static void main(String[] args) {
        int [] array1={1,2,3}; int[] array2={4,5,6};
        MergeArrays(array1, array2);
    }
}
