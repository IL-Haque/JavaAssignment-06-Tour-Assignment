class TourExpense {
    private String expenseType;
    private double cost;
    private String date;

    // Constructor
    public TourExpense(String expenseType, double cost, String date) {
        this.expenseType = expenseType;
        this.cost = cost;
        this.date = date;
    }

    public double getCost() {
        return cost;
    }

    public String getDate() {
        return date;
    }

    public void displayExpense() {
        System.out.println(date + ": " + expenseType + " - $" + cost);
    }
}

