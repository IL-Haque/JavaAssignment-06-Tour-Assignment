import java.util.Arrays;
import java.util.Scanner;

public class StudentPhotoArrangement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        double[] heights = new double[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the height of student " + (i + 1) + " (in cm): ");
            heights[i] = scanner.nextDouble();
        }
        Arrays.sort(heights);

        System.out.println("\nStudents arranged by height for the photo:");
        for (int i = 0; i < heights.length; i++) {
            System.out.printf("Student %d: %.1f cm%n", (i + 1), heights[i]);
        }

        scanner.close();
    }
}
