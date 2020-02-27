package Feb_26th;

public class Sixdigitpassword {
    public static void main(String[] args) {
        int count=0;
        while(count<6) {
            generatePass();
            count++;
        }
    }
    public static void generatePass() {
        //System.out.println((int) Math.random() * 100);
for(int i =1; i<7;i++){
    System.out.print((int)(Math.random()*10));
}
        System.out.println();
    }
}