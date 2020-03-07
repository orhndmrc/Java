package March_4th;

public class DimensionalArrays {
    public static void main(String[] args) {
        int[][] array = new int [2][2];
        array[0][0]= 10;
        array[0][1]= 20;
        array[1][0]= 30;
        array[1][1]= 40;
        int[][] array2 = {{10,20},{30,40}};
        System.out.println(array2[0][1]);
    }
}
