public class TourFeedback {

    private String studentName;
    private int rating;
    private String comments;

    public TourFeedback(String studentName, int rating, String comments) {
        this.studentName = studentName;
        this.rating = rating;
        this.comments = comments;
    }

    public int getRating() {
        return rating;
    }

    public String getComments() {
        return comments;
    }
}
