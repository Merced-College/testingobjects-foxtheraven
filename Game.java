//Xandra Quevedo
//9/11/25
//Game class for my Game objects

public class Game {
    
    //data variables - describing game attributes
    private String title;
    private int releaseDate;
    private int rating;

    //default constructor
    public Game() {
        this.title = "UFO 50";
        this.releaseDate = 2024;
        this.rating = 91;
    }

    //non-default constructor
    public Game(String title, int releaseDate, int rating) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.rating = rating;
    }

    //setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    //getters
    public String getTitle() {
        return title;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return title + ", released in " + releaseDate + ", is rated " + rating + " out of 100.";
    }

}
