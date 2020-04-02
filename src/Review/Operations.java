package Review;

public class Operations {


   public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
class AdvanceOperations extends Operations{
   public void SumProduct(int a, int b, int c) {
       System.out.println((a+b)*c);
   }
}
class OperationsTest{
    public static void main(String[] args) {
        Operations x= new Operations();
        x.add(1,2);
        AdvanceOperations y= new AdvanceOperations();
        y.SumProduct(3,4,5);
    }
}
