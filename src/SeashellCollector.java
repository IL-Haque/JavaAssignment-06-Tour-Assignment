import java.util.Scanner;

public class SeashellCollector {
    public static void main(String[] args) {

        int[] seashells = new int[5];
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("Enter the type of seashell to collect (0-4) or 'exit' to finish:");
            input = scanner.nextLine();
            if (!input.equals("exit")) {
                try {
                    int type = Integer.parseInt(input);
                    if (type >= 0 && type < seashells.length) {
                        seashells[type]++;
                        System.out.println("Collected a seashell of type " + type + "!");
                    } else {
                        System.out.println("Invalid type. Please enter a number between 0 and 4.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number or 'exit'.");
                }
            }
        } while (!input.equals("exit"));

        int total = 0;
        for (int count : seashells) {
            total += count;
        }

        System.out.println("Total seashells collected: " + total);
        for (int i = 0; i < seashells.length; i++) {
            System.out.println("Type " + i + ": " + seashells[i]);
        }

        scanner.close();
    }
}
