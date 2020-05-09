package JavaFiles;


import java.io.File;
import java.util.Scanner;

public class FileReading_ {
    public static void main(String[] args) {
        try {
            File myfile = new File("first.text");
            Scanner scanner = new Scanner(myfile);
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        }
        catch(Exception e){
            System.out.println("oops");
            e.printStackTrace();
        }
    }
}
