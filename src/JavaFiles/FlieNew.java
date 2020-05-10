package JavaFiles;

import java.io.File;

public class FlieNew {
    public static void main(String[] args) {

        try{
            File myfile = new File("C:\\Users\\demir\\IdeaProjects\\First\\src\\JavaFiles\\orhan.txt");
       if(myfile.createNewFile()) {
           System.out.println("File created "+myfile.getName());
       }
        }
        catch(Exception e ){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
