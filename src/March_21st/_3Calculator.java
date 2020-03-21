package March_21st;

public class _3Calculator {
    protected int value;
    public _3Calculator(){
        this.value=0;
        System.out.println("Display value: "+this.value);
    }
    protected int Add(int Num1, int Num2){
        this.value=Num1+Num2;
        return this.value;
    }
    private int Divide(int Num1, int Num2){
        this.value=Num1/Num2;
        return this.value;
    }
    public int Subtract(int Num1, int Num2){
        this.value=Num1-Num2;
        return this.value;
    }
   int  Multiply(int Num1, int Num2){
        this.value=Num1*Num2;
        return this.value;
    }
}
