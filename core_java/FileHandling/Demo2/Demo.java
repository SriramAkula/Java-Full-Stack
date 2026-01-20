

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        
        File folder=new File("Outer/Inner");

        if(folder.mkdirs()){
            System.out.println("Folders created successfully");
        }else{
            System.out.println("Folders not created successfully");

        }

        File file=new File(folder,"abc.txt");

        if(folder.exists()){
            try{
                file.createNewFile();
                System.out.println("File abc.txt created");
            }catch(IOException e){
                System.out.println("File already exists");
            }
        }else{
            System.out.println("Folder not created");
        }

        if(file.delete()){
            System.out.println("File deleted");
        }else{
            System.out.println("File not deleted");
        }

        File fdel=new File("Outer/Inner");
        if(fdel.delete()){
            System.out.println("Inner Folder deleted");
        }else{
            System.out.println("Folder not exists or Folder is not empty");
        }

        File of=new File("Outer");
        File target=new File("parent1/Parent2/OuterFolder/abc");
        target.mkdirs();
        if(of.renameTo(new File(target,"Folder"))){
            System.out.println("Rename successful");
        }else{
            System.out.println("Rename not successful");

        }
    }
}
