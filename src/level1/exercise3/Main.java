package level1.exercise3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> months = List.of("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");

        System.out.println("Months of the year:");
        months.forEach(month -> System.out.println("- " + month));
    }
}
