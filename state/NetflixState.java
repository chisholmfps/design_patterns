package state;

/**
 * NetflixState represents the Netflix mode of the TV.
 */
public class NetflixState extends Application implements State {
    private TV tv;

    /**
     * Constructs a NetflixState and loads sample movies and shows.
     * @param tv the context TV object
     */
    public NetflixState(TV tv) {
        this.tv = tv;
        movies.add("Stranger Things");
        movies.add("Extraction");
        tvShows.add("The Witcher");
        tvShows.add("Ozark");
    }

    @Override
    public void pressHomeButton() {
        System.out.println("Returning to Home...");
        tv.setState(tv.getHomeState());
    }

    @Override
    public void pressNetflixButton() {
        System.out.println("You are already on Netflix.");
    }

    @Override
    public void pressHuluButton() {
        System.out.println("Loading Hulu...");
        tv.setState(tv.getHuluState());
    }

    @Override
    public void pressMovieButton() {
        displayMovies();
    }

    @Override
    public void pressTVButton() {
        displayTVShows();
    }

    @Override
    public void watch(String title) {
        super.watch(title);
    }
}