import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Print a greeting
        System.out.println("Hello, World!");

        // Take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Personalized output
        System.out.println("Nice to meet you, " + name + "!");
        
        scanner.close();
    }
}