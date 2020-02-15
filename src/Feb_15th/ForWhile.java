package Feb_15th;

public class ForWhile {
    public static void main(String[] args) {
        //while and for
        /*int month = 1;
        while(month<13){

            for(int day = 1; day<=30; day++){
                System.out.println(month+"/"+day+"/"+"2020");
            }
            month++;
        }*/
        //for and while
        for (int m = 1; m < 13; m++) {


            int d = 1;
            while (d < 31) {
                System.out.println(m+"/"+d+"/"+"2020");
                d++;
            }
        }

    }
}