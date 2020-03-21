package March_21st;

public class _3AdvancedCalculator extends _3Calculator {
    protected String ScreenColor;
    public _3AdvancedCalculator(){
        super();
        this.ScreenColor= "blue";

    }
    double average(int Num1, int Num2){

        return   (Num1+Num2)/2;
    }
     int factorial(int Num1){
        int result=1;
       for(int i=Num1; i>=1; i--){
           result*=i;
       }
        return  result;
    }
     double sqrt(double Num1){

        return  Math.sqrt(Num1);
    }
     double pow(int Num1, int Num2){

        return   Math.pow(Num1,Num2);
    }
}
