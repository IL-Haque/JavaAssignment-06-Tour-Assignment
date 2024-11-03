public class TourExpenseRunner {
    public static void main(String[] args) {
        TourExpense[] expenses = new TourExpense[5];
        expenses[0] = new TourExpense("Food", 50.0, "2024-11-01");
        expenses[1] = new TourExpense("Transportation", 20.0, "2024-11-01");
        expenses[2] = new TourExpense("Accommodation", 100.0, "2024-11-02");
        expenses[3] = new TourExpense("Activities", 30.0, "2024-11-02");
        expenses[4] = new TourExpense("Souvenirs", 25.0, "2024-11-03");

        double totalCost = 0;
        System.out.println("Daily Expenses:");
        for (TourExpense expense : expenses) {
            totalCost += expense.getCost();
            expense.displayExpense();
        }

        System.out.printf("Total cost of the tour: $%.2f%n", totalCost);
    }
}
