package JavaFiles;

import java.io.FileWriter;
import java.util.Scanner;

public class MergingFilesConcatenate  {
    public static void main(String[] args) throws Exception {
        Scanner scanA = new Scanner("C:\\Users\\demir\\IdeaProjects\\First\\src\\JavaFiles\\a.txt");
        Scanner scanB = new Scanner("C:\\Users\\demir\\IdeaProjects\\First\\src\\JavaFiles\\b.txt");
        String contentA="";
        String contentB="";
        while(scanA.hasNext()){
            contentA+=scanA.nextLine();

        }
        scanA.close();
        while(scanB.hasNext()){
            contentB+=scanA.nextLine();

        }
        scanB.close();
        FileWriter writer = new FileWriter("C:\\Users\\demir\\IdeaProjects\\First\\src\\JavaFiles\\c.txt");
        writer.write(contentA+"\n"+contentB);
        writer.close();
    }
}
