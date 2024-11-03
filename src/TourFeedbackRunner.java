import java.util.Scanner;

public class TourFeedbackRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of feedback entries: ");
        int numberOfFeedbacks = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        TourFeedback[] feedbacks = new TourFeedback[numberOfFeedbacks];

        for (int i = 0; i < numberOfFeedbacks; i++) {
            System.out.print("Enter student's name: ");
            String name = scanner.nextLine();
            System.out.print("Enter rating (1 to 10): ");
            int rating = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter comments: ");
            String comments = scanner.nextLine();
            feedbacks[i] = new TourFeedback(name, rating, comments);
        }

        double totalRating = 0;
        for (TourFeedback feedback : feedbacks) {
            totalRating += feedback.getRating();
        }
        double averageRating = totalRating / numberOfFeedbacks;

        System.out.printf("Average Rating: %.2f%n", averageRating);
        System.out.println("Comments:");
        for (TourFeedback feedback : feedbacks) {
            System.out.println("- " + feedback.getComments());
        }

        scanner.close();
    }
}
