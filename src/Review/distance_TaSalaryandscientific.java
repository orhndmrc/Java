package Review;

public class distance_TaSalaryandscientific {
    public static void main(String[] args) {
        System.out.println(distance(1, 2,4, 6));
        System.out.println(scientific(6.23, 5.0));
        System.out.println(pay(4.00,11));
    }
//distance between two points
    public static double distance(int x1, int y1,int x2, int y2){

return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
 }
    public static double scientific(double x, double y){

        return x*Math.pow((10),y);
    }
    //TA's salary
    public static double pay(double hourlypay, double NumOfHours){
        double pay=hourlypay*NumOfHours;
if(NumOfHours>8){
    pay=hourlypay*8+((3*hourlypay)/2)*(NumOfHours-8);
    System.out.println(pay);
}
      else{
    System.out.println(pay);
      }
      return pay;
    }
}
