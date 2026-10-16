import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // 1. Get the total number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character

        // Create arrays to store names and scores based on the input size
        String[] studentNames = new String[numStudents];
        double[] studentScores = new double[numStudents];

        System.out.println("------------------------------");

        // 2. Loop to ask for each student's name and score
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine(); // Read the name

            System.out.print("Enter score for " + studentNames[i] + ": ");
            studentScores[i] = scanner.nextDouble(); // Read the score
            scanner.nextLine(); // Consume the leftover newline character
            
            System.out.println("------------------------------");
        }
        scanner.close();
    }
}
