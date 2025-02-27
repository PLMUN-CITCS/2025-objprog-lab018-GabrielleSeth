import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        // Step 1: Get integer input from the user
        int number = getIntegerInput();
        
        // Step 2: Determine if it's even or odd
        String resultMessage = checkEvenOrOdd(number);
        
        // Step 3: Display the result
        System.out.println(resultMessage);
    }

    // Method to get a valid integer input from the user
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            try {
                System.out.print("Enter an integer: ");
                number = Integer.parseInt(scanner.nextLine()); // Read and parse input
                break; // Exit loop if valid integer
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        scanner.close();
        return number;
    }

    // Method to check if a number is even or odd
    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }
}
