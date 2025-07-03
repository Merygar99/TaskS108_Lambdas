package level1.exercise4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> months = List.of("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");

        System.out.println("Months of the year:");
        printMonths(months);
    }

    public static void printMonths(List<String> months) {
        months.forEach(month -> System.out.println("- " + month));
    }
}
