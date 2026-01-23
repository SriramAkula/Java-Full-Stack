import java.util.List;
import java.util.Arrays;


@FunctionalInterface
interface  Greeting {
    void sayHello();
}

@FunctionalInterface
interface Print{
    void message(String msg);
}

@FunctionalInterface
interface Add{
    int add(int a,int b);
}

public class Demo {
    public static void main(String[] args) {
        Greeting g=new Greeting() {public void sayHello()
            {System.out.println("Hi From Sriram");}
        };

        g.sayHello();

        Greeting g1= () -> {System.out.println("Hi From Sri");};
        g1.sayHello();

        Print pt=new Print() {
            public void message(String a){
                System.out.println("Hi "+a);
            }
        };

        pt.message("Sriram");

        Print pt1 = msg -> System.out.println("Hi "+msg);

        pt1.message("Ram");

        Add a1= (a,b) -> {return a+b;};
        Add a3= (a,b) -> {
            System.out.println("Addition: "+a+b);
            return a+b;
        };
        Add a2= (a,b) -> a+b;
        System.out.println(a1.add(5, 3));
        System.out.println(a2.add(5, 3));
        a3.add(4,5);

        List<String> names=Arrays.asList("Sriram","Kalyan","Nithin","Billa");

        names.forEach( (ele) -> System.out.println(ele.toUpperCase()));
    }
}
