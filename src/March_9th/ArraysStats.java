package March_9th;

public class ArraysStats {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,5,6}};
        System.out.println(printRowPrint(a));
        System.out.println(printRowMin(a));
    }
    public static int printRowPrint(int[][]arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
        }
        return max;
    }public static int printRowMin(int [][]arr) {
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
        }return min;
    }
}
