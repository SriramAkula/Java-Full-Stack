import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.*;

public class RemoveNull {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>(Arrays.asList(3,4,null,9,7,null));

        list = list.stream()
                    .filter(n -> n!=null)
                    .collect(Collectors.toList());

        System.out.println(list);

    }
}
