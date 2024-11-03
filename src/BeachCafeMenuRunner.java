
 import java.util.Scanner;

    public class BeachCafeMenuRunner {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            BeachCafeMenu[] menu = {
                    new BeachCafeMenu("Veggie Burger", 8.50, true),
                    new BeachCafeMenu("Fish Tacos", 10.00, false),
                    new BeachCafeMenu("Caprese Salad", 7.00, true),
                    new BeachCafeMenu("Chicken Sandwich", 9.50, false),
                    new BeachCafeMenu("Fruit Smoothie", 5.00, true)
            };

            System.out.println("Menu:");
            for (BeachCafeMenu item : menu) {
                item.displayItem();
            }

            System.out.print("\nWould you like to see vegetarian options? (yes/no): ");
            String showVegetarian = scanner.nextLine();

            if (showVegetarian.equalsIgnoreCase("yes")) {
                System.out.println("\nVegetarian Options:");
                for (BeachCafeMenu item : menu) {
                    if (item.isVegetarian()) {
                        item.displayItem();
                    }
                }
            }

            scanner.close();
        }
    }










