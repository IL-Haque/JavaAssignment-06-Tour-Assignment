import java.util.Scanner;

public class BeachGameScores {
    public static void main(String[] args) {
        final int NUM_TEAMS = 2;
        final int NUM_GAMES = 3;

        int[][] scores = new int[NUM_TEAMS][NUM_GAMES];

        Scanner scanner = new Scanner(System.in);

        for (int game = 0; game < NUM_GAMES; game++) {
            System.out.println("Enter scores for Game " + (game + 1) + ":");
            for (int team = 0; team < NUM_TEAMS; team++) {
                System.out.print("Team " + (team + 1) + " score: ");
                scores[team][game] = scanner.nextInt();
            }
        }

        System.out.println("\nTotal Scores:");
        for (int team = 0; team < NUM_TEAMS; team++) {
            int totalScore = 0;
            for (int game = 0; game < NUM_GAMES; game++) {
                totalScore += scores[team][game];
            }
            System.out.println("Team " + (team + 1) + ": " + totalScore);
        }

        scanner.close();
    }
}
