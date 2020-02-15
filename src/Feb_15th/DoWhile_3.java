package Feb_15th;

public class DoWhile_3 {
    public static void main(String[] args) {
        //with for loop
        for (int Month = 1; Month < 13; Month++) {
            for (int Day = 1; Day <= 30; Day++) {
                System.out.println(Month + "/" + Day + "/" + "2020");
            }
            System.out.println("_________________________");
            //while version
            int month = 1;

            while (month < 13) {
                int day = 1;
                while (day < 31) {
                    System.out.println(month + "/" + day + "/" + "2020\t");
                    day++;
                }
                month++;
            }
            //dowhile version
            int m = 1;

            do {
                int d = 1;

                do {
                    System.out.println(m + "/" + d + "/" + "2020");
                    d++;
                }
                while (d < 31);
                m++;
            }
            while (m < 13);


        }
    }
}
