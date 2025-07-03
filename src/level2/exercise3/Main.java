package level2.exercise3;

public class Main {
    public static void main(String[] args) {
        float a = 20;
        float b = 5;

        OperationInterface sum = () -> a + b;
        OperationInterface subtract = () -> a - b;
        OperationInterface multiplication = () -> a * b;
        OperationInterface division = () -> a / b;

        System.out.println("Sum: " + sum.operation());
        System.out.println("Subtract: " + subtract.operation());
        System.out.println("Multiplication: " + multiplication.operation());
        System.out.println("Division: " + division.operation());
    }
}
