package Review;

public class ICalculator {
    int currentValue=0;

    public int getCurrentValue() {
        return currentValue;
    }
    public int add(int a){
return currentValue+a;
    }
    public int sub(int a){
return currentValue-a;
    }
    public int mul(int a){
        return currentValue*a;
    }
    public int div(int a){
        return currentValue/a;
    }
}
class ICalculator1 extends ICalculator{
    @Override
    public int getCurrentValue() {
        return super.getCurrentValue();
    }

    @Override
    public int add(int a) {
        return super.add(a);
    }

    @Override
    public int sub(int a) {
        return super.sub(a);
    }

    @Override
    public int mul(int a) {
        return super.mul(a);
    }

    @Override
    public int div(int a) {
        return super.div(a);
    }

    public int sign(){

     return getCurrentValue();
    }
}
class main{
    public static void main(String[] args) {
        ICalculator x = new   ICalculator();
        ICalculator1 mine = new   ICalculator1();
        System.out.println(mine.sign());
        System.out.println(x.getCurrentValue());

    }
}
