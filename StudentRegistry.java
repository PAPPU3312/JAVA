import java.util.Scanner;

class Student {
    String name;
    double percentage;

    // Constructor
    Student(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name + " | Percentage: " + percentage + "%");
    }
}

public class StudentRegistry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline

        // Create an array to store Student objects
        Student[] students = new Student[n];

        // Input Loop
        for (int i = 0; i < n; i++) {
            System.out.println("\nEntering details for student " + (i + 1) + ":");
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter Percentage: ");
            double percent = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            students[i] = new Student(name, percent);
        }

        // Display Loop
        System.out.println("\n--- Student Records ---");
        for (Student s : students) {
            s.display();
        }

        scanner.close();
    }
}
