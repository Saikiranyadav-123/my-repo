Here’s a simple Java program to get you started. It demonstrates basic concepts like input/output, variables, and a conditional statement.
Javaimport java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Greet the user
        System.out.println("Hello, " + name + "! Welcome to Java programming.");

        // Ask for the user's age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check if the user is an adult
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are not an adult yet.");
        }

        // Close the scanner
        scanner.close();
    }
}

#How it works:

Input/Output: The program uses Scanner to take input from the user and System.out.println to display output.
Variables: It uses String for the name and int for the age.
Conditional Statement: An if-else block checks if the user is an adult.

Feel free to modify and experiment with this code!
#this is line i added
