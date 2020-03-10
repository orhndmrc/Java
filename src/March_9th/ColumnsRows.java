package March_9th;

public class ColumnsRows {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] result = transposeArray(arr);
        for(int row[]:result){
            for(int number:row){
                System.out.print("\t"+number);
            }
            System.out.println();
        }
    }

    public static int[][] transposeArray(int [][] numbers){
        int[][] transposed = new int[numbers.length][numbers[0].length];
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                transposed[j][i]=numbers[i][j];
            }
        }
        return transposed;
    }

}

