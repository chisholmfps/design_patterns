package state;

/**
 * HuluState represents the Hulu mode of the TV.
 */
public class HuluState extends Application implements State {
    private TV tv;

    /**
     * Constructs a HuluState and loads sample movies and shows.
     * @param tv the context TV object
     */
    public HuluState(TV tv) {
        this.tv = tv;
        movies.add("Palm Springs");
        movies.add("Run");
        tvShows.add("The Bear");
        tvShows.add("Only Murders in the Building");
    }

    @Override
    public void pressHomeButton() {
        System.out.println("Returning to Home...");
        tv.setState(tv.getHomeState());
    }

    @Override
    public void pressNetflixButton() {
        System.out.println("Loading Netflix...");
        tv.setState(tv.getNetflixState());
    }

    @Override
    public void pressHuluButton() {
        System.out.println("You are already on Hulu.");
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