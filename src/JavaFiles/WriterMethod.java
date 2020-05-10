package JavaFiles;

import java.io.FileWriter;

public class WriterMethod {
    public static void main(String[] args) throws Exception {
        FileWriter myWriter = new FileWriter("C:\\Users\\demir\\IdeaProjects\\First\\src\\JavaFiles\\orhan.txt");
        myWriter.write("Java is fun\n");
        myWriter.write("Orhan is perfect");
        System.out.println("Successfully the file created");
        myWriter.close();
    }
}
