package level1.exercise8;

public class Main {
    public static void main(String[] args) {

        ReverseStringInterface reverseExample = (input) -> new StringBuilder(input).reverse().toString();

        String original = "apple";
        String reversed = reverseExample.reverseString(original);

        System.out.println(reversed);

    }

}
