package JavaFiles;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class PriceProduct {
    public static void main(String[] args) throws Exception {
        FileWriter file = new FileWriter("C:\\Users\\demir\\IdeaProjects\\First\\src\\JavaFiles\\data.txt");
        file.write("Chips $2.99\n");
        file.write("Apple $1.49\n");
        file.write("Candy $1.19");
        file.close();
        System.out.println("************************************");
        File read = new File("C:\\Users\\demir\\IdeaProjects\\First\\src\\JavaFiles\\data.txt");
        Scanner scan = new Scanner(read);
        while(scan.hasNext()){
            String data = scan.nextLine();
            System.out.println(data);
        }
        scan.close();
        System.out.println("*******************************");
        File read1 = new File("C:\\Users\\demir\\IdeaProjects\\First\\src\\JavaFiles\\data.txt");
        Scanner scan1 = new Scanner(read1);
        int amountOfProduct=0;
        while(scan1.hasNext()){
            String line= scan1.nextLine();
            amountOfProduct++;
            if(line.startsWith("A")){
                System.out.println(line);
            }

        }
        System.out.println("Total products : "+amountOfProduct);
        System.out.println("Total chars :"+read1.length());
        scan1.close();
    }
}
