import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // 1. Create a Scanner object to read user input
        Scanner reader = new Scanner(System.in);

        System.out.println("--- Simple Java Calculator ---");

        // 2. Ask for the first number
        System.out.print("Enter first number: ");
        double num1 = reader.nextDouble();

        // 3. Ask for the operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);

        // 4. Ask for the second number
        System.out.print("Enter second number: ");
        double num2 = reader.nextDouble();

        double result;

        // 5. Use a switch statement to perform the calculation
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                // Check for division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    return; // Exit the program
                }
                break;

            // Handle cases where the user enters a wrong operator
            default:
                System.out.println("Error! Operator is not correct.");
                return;
        }

        // 6. Print the final result
        System.out.println("The result is: " + result);
        
        reader.close();
    }
}
