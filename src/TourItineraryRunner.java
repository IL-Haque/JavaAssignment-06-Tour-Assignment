public class TourItineraryRunner {
    public static void main(String[] args) {

        TourItinerary[] itinerary = new TourItinerary[3];
        itinerary[0] = new TourItinerary("Monday", "9:00 AM", "Visit the museum");
        itinerary[1] = new TourItinerary("Tuesday", "2:00 PM", "Hiking in the national park");
        itinerary[2] = new TourItinerary("Wednesday", "1:00 PM", "City sightseeing tour");

        System.out.println("Tour Itinerary:");
        for (TourItinerary plan : itinerary) {
            plan.printItinerary();
        }
    }
}