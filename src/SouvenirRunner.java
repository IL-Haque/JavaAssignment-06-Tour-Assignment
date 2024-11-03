import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SouvenirRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Souvenir[] souvenirs = {
                new Souvenir("Postcard", 1.50),
                new Souvenir("Keychain", 3.00),
                new Souvenir("Fridge Magnet", 2.50),
                new Souvenir("T-shirt", 15.00),
                new Souvenir("Souvenir Mug", 8.00)
        };

        List<Souvenir> cart = new ArrayList<>();

        System.out.println("Available Souvenirs:");
        for (Souvenir souvenir : souvenirs) {
            System.out.printf("%s - $%.2f%n", souvenir.getName(), souvenir.getPrice());
        }

        String userInput;
        do {
            System.out.print("Enter the name of the souvenir to buy (or 'done' to finish): ");
            userInput = scanner.nextLine();

            for (Souvenir souvenir : souvenirs) {
                if (souvenir.getName().equalsIgnoreCase(userInput)) {
                    cart.add(souvenir);
                    System.out.println("Added " + souvenir.getName() + " to your cart.");
                }
            }
        } while (!userInput.equalsIgnoreCase("done"));

        double totalCost = 0;
        for (Souvenir item : cart) {
            totalCost += item.getPrice();
        }

        System.out.printf("Total cost of your souvenirs: $%.2f%n", totalCost);
        scanner.close();
    }
}
