package JavaFiles;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class MergingFiles {
    public static void main(String[] args) throws Exception {
        FileWriter a = new FileWriter("C:\\Users\\demir\\IdeaProjects\\First\\src\\JavaFiles\\a.txt");
        a.write("Hey are you there");
        a.close();
        FileWriter b = new FileWriter("C:\\Users\\demir\\IdeaProjects\\First\\src\\JavaFiles\\b.txt");
        b.write("What's up?");
        b.close();



    }
}
