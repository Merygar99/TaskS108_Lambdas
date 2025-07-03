package level2.exercise4;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>(Arrays.asList(
                "banana", 3, "apple", 42, "cherry", "elephant", 100, "grape", "zebra"));


        list.sort((o1, o2) -> {
            String s1 = o1.toString();
            String s2 = o2.toString();
            return Character.compare(s1.charAt(0), s2.charAt(0));
        });
        System.out.println("Ordered by the first character:");
        System.out.println(list);


        list.sort((o1, o2) -> {
            String s1 = o1.toString();
            String s2 = o2.toString();
            return (s1.contains("e") ? 0 : 1) - (s2.contains("e") ? 0 : 1);
        });
        System.out.println("Strings with ‘e’ first:");
        System.out.println(list);


        list = list.stream()
                .map(obj -> {
                    String s = obj.toString();
                    return s.contains("a") ? s.replace("a", "4") : s;
                })
                .collect(Collectors.toList());
        System.out.println("Strings with ‘a’ modified to ‘4’:");
        System.out.println(list);


        List<Object> onlyNumbers = list.stream()
                .filter( s -> s.toString().matches("-?\\d+"))
                .collect(Collectors.toList());
        System.out.println("Numerical elements:");
        System.out.println(onlyNumbers);

    }
}
