package level1.exercise1;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Ana", "Juan", "Antonio", "Pedro", "Roberto", "Oscar");

        List<String> namesWithO = names.stream()
                .filter(name -> name.contains("o") || name.contains("O"))
                .collect(Collectors.toList());

        System.out.println(namesWithO);

    }
}
