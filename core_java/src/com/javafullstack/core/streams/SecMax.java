import java.util.*;


public class SecMax {
    public static void main(String[] args) {
        

        ArrayList<Integer>  list = new ArrayList<>(Arrays.asList(1,4,3,7,8,4));

        Optional<Integer> max2 = list.stream()
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .skip(1)
                        .findFirst();

        
        max2.ifPresent(System.out::println);
    }
}
