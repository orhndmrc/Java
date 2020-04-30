package Review;

public class Calculator {
    protected double accumulator;
}
 class CalculatorWithMemory extends Calculator{
    double memory=0;
     void save() {
         accumulator = memory;
     }
        void recall() {
             memory=accumulator;
         }
         void clearMemory(){
             memory=0;
         }
        double getMemory(){
         return memory;
         }


}