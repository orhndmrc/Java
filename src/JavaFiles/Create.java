package JavaFiles;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Create {
    public static void main(String[] args) throws Exception{

        FileWriter writer = new FileWriter("data.text");
        writer.write("Chips $2.99\n");
        writer.write("Apple $1.49\n");
        writer.write("Candy $1.19");
        writer.close();
    File read = new File("data.text");
    Scanner scanner= new Scanner(read);
    while(scanner.hasNext()){
        System.out.println(scanner.nextLine());
    }
     scanner.close();
        System.out.println("*******************************");
        Scanner scan= new Scanner(read);
        String line;
        while(scan.hasNext()){
            line=scan.nextLine();
            if(line.charAt(0)=='A'){
                System.out.println("The item starting with A "+line);

            }

        }
        scan.close();
        System.out.println("******************************************");
        Scanner scan2 = new Scanner(read);
        int count=0;
        while(scan2.hasNext()){
            count+=scan2.nextLine().length();
        }
        System.out.println("Total number of chars "+count);
        scan2.close();
        System.out.println("**************************");
        Scanner scan3 = new Scanner(read);
        int count2=0;
        while(scan3.hasNext()){
            scan3.nextLine();
            count2++;
        }
        System.out.println("The number of items "+count2);
        scan3.close();
    }

}
