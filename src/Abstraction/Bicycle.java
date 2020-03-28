package Abstraction;

abstract class Bicycle {
    abstract  void SpeedUp();
    abstract  void SlowDown();
    abstract  void Stop();
    abstract  void Start();
}
class MountainBike extends Bicycle{
    private String TireType;
    private int seatHeight;

    public MountainBike(String tireType, int seatHeight) {
       this.TireType = tireType;
        this.seatHeight = seatHeight;
    }

    public String getTireType() {
        return TireType;
    }

    public void setTireType(String tireType) {
        TireType = tireType;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public void SpeedUp(){
        System.out.println("speed");
    }
    public void SlowDown(){
        System.out.println("slow");
    }
    public void Stop(){
        System.out.println("stop");
    }
    public void Start(){
        System.out.println("start hitting gas");
    }
    public void SwitchToSteepMode(){
        System.out.println("Steep mode activated");
    }

    @Override
    public String toString() {
        return "MountainBike{" +
                "TireType='" + TireType + '\'' +
                ", seatHeight=" + seatHeight +
                '}';
    }
}
class MountainBikeTest{
    public static void main(String[] args) {
        MountainBike newbike= new  MountainBike("ff",7);
        newbike.SwitchToSteepMode();
    }
}
