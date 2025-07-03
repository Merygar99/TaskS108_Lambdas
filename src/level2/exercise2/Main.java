package level2.exercise2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 55, 44);
        String result = convertList(numbers);
        System.out.println("Result:");
        System.out.println(result);
    }

    public static String convertList(List<Integer> lista) {
        return lista.stream()
                .map(n -> (n % 2 == 0 ? "e" : "o") + n)
                .collect(Collectors.joining(", "));
    }
}
