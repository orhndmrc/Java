package Feb_16th;



public class HEXNumbers {
    //hexadecimal numbers--->made up of 16 symbols{0,1,2,3..,9,A,B,C,D,E,F} Example D75A
    // System.out.println("Hello".charAt(2)); charAt(2) means 3rd(2nd index number) letter in the string. Example Hello World---->"Hello".charAt(2)-->index num(e)--1(converting different bases to base 10
    public static void main(String[] args) {
        String a ="1243AF242";
        for (int i=0; i<9; i++){
            System.out.print(a.charAt(i)+"\t");
            if (a.charAt(i)=='A' || a.charAt(i)=='B' || a.charAt(i)== 'C' || a.charAt(i)== 'D' || a.charAt(i)== 'E' || a.charAt(i)== 'F'){
                System.out.println("It's HEX");
            } else
                System.out.println("It's not");
        }
        System.out.println("Hello".charAt(4));
    }
}



