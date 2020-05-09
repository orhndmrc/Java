package JavaFiles;

import java.io.File;

public class FileFirst {
    public static void main(String[] args) {
        try {
            File myFile = new File("first.txt");
            if(myFile.createNewFile()){
                System.out.println("File created");
            }
            else{
                System.out.println("File already exist");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
