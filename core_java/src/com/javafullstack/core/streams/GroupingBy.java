import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;


public class GroupingBy {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Sriram","Kalyan","Nithin","Billa","Billa"));

        Map<Integer, List<String>> map = names.stream()
                                            .collect(Collectors.groupingBy(
                                                String::length,
                                                Collectors.mapping(
                                                    String::toUpperCase,
                                                    Collectors.toList())
                                            ));
        
        System.out.println(map);

        IntSummaryStatistics statistics = names.stream()
                                            .collect(Collectors.summarizingInt(String::length));
        
        System.out.println(statistics.getCount());
        System.out.println(statistics.getMax());
        System.out.println(statistics.getMin());
        System.out.println(statistics.getSum());
        System.out.println(statistics.getAverage());

                                    names.stream()
                                      .collect(Collectors.groupingBy(
                                        s->s,TreeMap::new,
                                        Collectors.counting()
                                    ))
                                    .entrySet().stream()
                                    .forEach(obj -> System.out.println(obj.getKey() + " " + obj.getValue()));

                                      
    }
}
