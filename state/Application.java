package state;

import java.util.ArrayList;

/**
 * Application is an abstract base class for storing and displaying media content.
 */
public abstract class Application {
    protected ArrayList<String> movies;
    protected ArrayList<String> tvShows;

    /**
     * Constructor initializes the movies and TV shows lists.
     */
    public Application() {
        movies = new ArrayList<>();
        tvShows = new ArrayList<>();
    }

    /**
     * Displays all available movies.
     */
    public void displayMovies() {
        System.out.println("Available Movies:");
        for (String movie : movies) {
            System.out.println("- " + movie);
        }
    }

    /**
     * Displays all available TV shows.
     */
    public void displayTVShows() {
        System.out.println("Available TV Shows:");
        for (String show : tvShows) {
            System.out.println("- " + show);
        }
    }

    /**
     * Attempts to watch a media title.
     * @param title The title of the media to watch.
     */
    public void watch(String title) {
        if (movies.contains(title) || tvShows.contains(title)) {
            System.out.println("Now playing: " + title);
        } else {
            System.out.println("Sorry, \"" + title + "\" is not available.");
        }
    }
}
