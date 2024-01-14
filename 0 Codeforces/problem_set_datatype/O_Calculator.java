import java.util.Scanner;

public class O_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input as a single string
        String input = scanner.nextLine();

        // Split the input into operands and operator
        String[] parts = input.split("[\\+\\-\\*/]");
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        char operator = input.charAt(parts[0].length());

        // Calculate the result based on the operator
        int result = 0;
        switch (operator) {
            case '+':
                result = A + B;
                break;
            case '-':
                result = A - B;
                break;
            case '*':
                result = A * B;
                break;
            case '/':
                result = A / B;
                break;
        }

        // Print the result
        System.out.println(result);

        // Close the scanner
        scanner.close();
    }
}
