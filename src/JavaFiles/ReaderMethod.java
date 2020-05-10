package JavaFiles;

import java.io.File;
import java.util.Scanner;

public class ReaderMethod {
    public static void main(String[] args) throws Exception {
        File myfile = new File("C:\\Users\\demir\\IdeaProjects\\First\\src\\JavaFiles\\orhan.txt");
        Scanner myscanner = new Scanner(myfile);
        while(myscanner.hasNext()){
            String data = myscanner.nextLine();
            System.out.println(data);
        }
        myscanner.close();
    }
}
