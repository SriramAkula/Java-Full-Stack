import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class GreaterK {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3,4,5,1,6));

        int k= 3;

        list.stream()
                .filter(n -> n > k)
                .forEach(n -> System.out.print(n+" "));


    }
}
