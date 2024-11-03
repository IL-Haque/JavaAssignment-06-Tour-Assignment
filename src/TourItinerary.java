class TourItinerary {

    private String day;
    private String time;
    private String activity;

    public TourItinerary(String day, String time, String activity) {
        this.day = day;
        this.time = time;
        this.activity = activity;
    }

    public void printItinerary() {
        System.out.println(day + " at " + time + ": " + activity);
    }
}
