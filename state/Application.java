package state;

import java.util.ArrayList;

public abstract class Application {
    protected ArrayList<String> movies;
    protected ArrayList<String> tvShows;

    public Application() {
        movies = new ArrayList<>();
        tvShows = new ArrayList<>();
    }

    public void displayMovies() {
        System.out.println("Available Movies:");
        for (String movie : movies) {
            System.out.println("- " + movie);
        }
    }

    public void displayTVShows() {
        System.out.println("Available TV Shows:");
        for (String show : tvShows) {
            System.out.println("- " + show);
        }
    }

    public void watch(String title) {
        if (movies.contains(title) || tvShows.contains(title)) {
            System.out.println("Now playing: " + title);
        } else {
            System.out.println("Sorry, \"" + title + "\" is not available.");
        }
    }
}