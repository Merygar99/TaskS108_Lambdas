package level2.exercise1;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Ana", "Juan", "Antonio", "Pedro", "Roberto", "Oscar", "Ada");

        List<String> namesStartsWithA = names.stream()
                .filter(name -> name.contains("A") && name.length() == 3)
                .collect(Collectors.toList());

        System.out.println(namesStartsWithA);
    }
}
