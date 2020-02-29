package Feb_29th;

public class OddintegerArray {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6,7,8,9,10,11};
        int sum=0;
        for(int i =0; i<array.length;i++){
            if(array[i]%2==1){
                sum=sum+array[i];
                System.out.println(array[i]);

            }

        }
        System.out.println("Sum of odd numbers : "+sum);
 int counter = 0;
 for(int i=0; i<array.length; i++){
     if(array[i]%2 !=0){
         counter++;
     }
 }
        System.out.println("Total numbers of odd numbers : "+counter);
    }
}
