public class SwapNumbers {
    public static void main(String[] args){
        int a=3;
        int b=5;
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("a: "+a+" b: "+b);
        
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a: "+a+" b: "+b);
        
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a: "+a+" b: "+b);

    }
}
