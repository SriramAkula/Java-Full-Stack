import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        
        File file=new File("employees.txt");

        List<Employee> emp=new ArrayList<>();

        emp.add(new Employee(1,"A","CSE",15000));
        emp.add(new Employee(2,"B","CST",20000));
        emp.add(new Employee(3,"C","MPC",35000));
        emp.add(new Employee(4,"D","CHE",10000));
        try(BufferedWriter bw =new BufferedWriter(new FileWriter(file))){
            bw.write("ID    NAME    DEPT    SALARY");
            bw.newLine();

            for(Employee e: emp){
                bw.write(e.toString());
                bw.newLine();
            }

            bw.close();

        }catch(Exception e){
            e.getMessage();
            e.printStackTrace();
        }
    }
}
