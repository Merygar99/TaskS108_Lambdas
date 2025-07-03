package level1.exercise5;

public class Main {
    public static void main(String[] args) {
        PiValue pi = () -> 3.1415;

        System.out.println("The value of pi is: " + pi.getPiValue());
    }
}
