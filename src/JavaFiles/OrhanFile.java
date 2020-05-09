package JavaFiles;

import java.io.File;

public class OrhanFile {
    public static void main(String[] args) throws Exception {
        File myfile = new File("Orhan.txt");
        if(myfile.createNewFile()){
            System.out.println("File created "+myfile);
        }
        else{
            System.out.println("File already exist");
        }
    }
}
