package March_21st;

public class _2Bicycle {
    protected int gear;
    protected double speed;
    public _2Bicycle(int gear, double speed){
        this.gear=gear;
        this.speed=speed;

    }
    public void speedUp(){
        this.speed=speed++;
    }
    public void slowDown(){
        this.speed=speed--;
    }
}
