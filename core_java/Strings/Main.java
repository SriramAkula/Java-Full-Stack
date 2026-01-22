

public class Main {
    public static void main(String args[]){
        String s1="Sriram";
        String s2=new String("Sriram"); //Makes sures scp version exist and creates in heap
        String s3=s2.intern(); //Points to the string in pool

        System.out.println(s1==s3);
        // s3 --> SCP "Sriram"  <-- s1

        System.out.println("-----------------Methods-----------------");

        String s="Sriram";

        System.out.println(s.length());
        System.out.println(s.charAt(5));
        System.out.println(s.substring(3));
        System.out.println(s.substring(1,4));
        System.out.println(s.concat(" Akula"));
        System.out.println(s.indexOf("ram"));
        System.out.println(s.indexOf("r",2));
        System.out.println(s.lastIndexOf("r"));
        System.out.println(s.equals("Sriram"));
        System.out.println(s.equalsIgnoreCase("sriram"));
        System.out.println(("sri").compareTo("Sqs")); 
        System.out.println(("sri").compareToIgnoreCase("Sqs")); 
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(" Sriram    ".trim());
        System.out.println(s.replace('r','p'));
        System.out.println(s.contains("ram"));
        System.out.println(s.toCharArray());
        System.out.println(s.startsWith("S"));
        System.out.println(s.startsWith("i",2));
    }
}
