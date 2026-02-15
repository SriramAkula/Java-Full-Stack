import java.util.*;

class Demo {
    public static void main(String[] args) {
        
        String s="Sriram";
        String rev = s.chars()
                    .mapToObj(c -> String.valueOf((char) c))
                    .reduce("",(a,b) -> b+a);
        System.out.println(rev);
        
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Sriram","Kalyan","Nithin","Billa"));
        
        Optional<String> longest = names.stream()
                                .reduce((a,b) -> a.length() > b.length() ? a : b);
                                
        System.out.println(longest.get());
        
    }
}