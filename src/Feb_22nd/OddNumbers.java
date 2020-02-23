package Feb_22nd;

public class OddNumbers {
    public static void printOddNumber(int a,int b) {
        for (int i = a; i < b; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }


                public static void main(String[]args){
                    printOddNumber(4, 19);

                }
            }

