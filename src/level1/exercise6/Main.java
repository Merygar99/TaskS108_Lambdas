package level1.exercise6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add("Sugar");
        list.add(2);
        list.add("Airplane");
        list.add(3);
        list.add("Java");

        List<String> orderedString = list.stream()
                .filter(s -> s instanceof String)
                .map(s -> (String) s)
                .sorted(Comparator.comparingInt(String :: length).reversed())
                .collect(Collectors.toList());

        orderedString.forEach(System.out::println);
    }
}
