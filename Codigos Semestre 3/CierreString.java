import java.util.Stack;
import java.util.Scanner;

public class CierreString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cadena de caracteres: ");
        System.out.println(isValid(scanner.nextLine())); // Call the isValid method and print the result
        scanner.close();
    }

    // Method to check if the input string contains valid parentheses

    public static boolean isValid(String input) {
        Stack<Character> stack = new Stack<>(); // Create a stack to store opening parentheses

        for (char c : input.toCharArray()) // Iterate through each character in the input string
        {
            if (c == '(' || c == '[' || c == '{') // If the character is an opening parenthesis
            {
                stack.push(c); // Push it onto the stack
            } 
            else if (c == ')' || c == ']' || c == '}') // If the character is a closing parenthesis
            {
                if (stack.isEmpty()) // If the stack is empty, there is no corresponding opening parenthesis
                {
                    return false;
                }

                char correspondingOpeningChar = CorrespondingOpener(c); // Get the corresponding opening parenthesis for the closing parenthesis

                if (stack.pop() != correspondingOpeningChar) // If the top of the stack is not the corresponding opening parenthesis                    
                {
                    return false;
                }
            }
        }
        return stack.isEmpty(); // If the stack is empty, all opening parentheses have been matched and removed
    }

    // Method to get the corresponding opening parenthesis for a closing parenthesis

    public static char CorrespondingOpener(char c) {
        switch (c) {
            case ')':
                return '(';
            case ']':
                return '[';
            case '}':
                return '{';
            default:
                return '\0'; // Return null character if no corresponding opening parenthesis found
        }
    }
}
