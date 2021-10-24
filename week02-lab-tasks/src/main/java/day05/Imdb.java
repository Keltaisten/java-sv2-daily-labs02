package day05;

public class Imdb {

    public static void main(String[] args) {
        Movie movie = new Movie("Ura", 2000);
        System.out.println(movie.rateMovie(5));
        System.out.println(movie.rateMovie(4));
        System.out.println(movie.rateMovie(5));

        Viewer viewer = new Viewer();
        viewer.watchMovie(movie,5);

        System.out.println(movie.getAvgRating());
    }
}
