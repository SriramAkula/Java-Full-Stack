import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        File f=new File("Folder1");

        if(f.mkdir()){
            System.out.println("Folder Created Successfully.");
        }else{

            System.out.println("Folder Already Exists");
        }

        f=new File("Folder1/abc.txt");

        try{

            f.createNewFile();
            System.err.println("File created");
        }catch(IOException e){
            System.out.println("File exists");
        }
        
        f
    }
}
