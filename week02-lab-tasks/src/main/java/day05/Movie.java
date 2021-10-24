package day05;

public class Movie {
    private String title;
    private int makeYear;
    private double avgRating;
    private int amountOfVoters;
    private int sumOfRatings;

    public Movie(String title, int makeYear) {
        this.title = title;
        this.makeYear = makeYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMakeYear() {
        return makeYear;
    }

    public void setMakeYear(int makeYear) {
        this.makeYear = makeYear;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
    }

        public double rateMovie(int rating){
            amountOfVoters++;
            sumOfRatings += rating;
            avgRating = (sumOfRatings *1.0)/ amountOfVoters *1.0;
            return avgRating;
        }
}
