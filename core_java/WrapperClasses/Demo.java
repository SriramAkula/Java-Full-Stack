public class Demo {
    public static void main(String[] args) {
        int a=10;
        Integer a1=a; //Auto-Boxing
        System.out.println(a1);
        System.out.println(a1.getClass()); 
        
        Integer a2=Integer.valueOf(a); //Auto-Boxing
        System.out.println(a2.getClass());
        
        
        int x1=a1; //auto-unboxing
        System.out.println(x1);
        
        String s1="200";
        a2=Integer.parseInt(s1); //Parses String to Integer Object
        System.out.println(a2);
        System.out.println(a2.getClass());

        
        Integer z1=100;
        long l1=z1; //implicit widening for auto-unboxing
        System.out.println(l1);

        // int z2=100;
        // Long l2=z2; // auto boxing primitive to wrapper not supports for different types
        // System.out.println(l2);

        Integer aa=150;
        Integer ba=150;
        System.out.println(aa==ba); //false

        Integer aa1=120;
        Integer ba1=120;
        System.out.println(aa1==ba1); //true (Integer cached range -128 to 127)


    }
}
