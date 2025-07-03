package level1.exercise2;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Ana", "Juan", "Antonio", "Pedro", "Roberto", "Olivia");

        List<String> namesWithSpecificLengthAndO = names.stream()
                .filter(name -> name.contains("o") && name.length() > 5 || name.contains("O") && name.length() > 5)
                .collect(Collectors.toList());

        System.out.println(namesWithSpecificLengthAndO);
    }
}
