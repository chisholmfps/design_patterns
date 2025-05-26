package state;

public class NetflixState extends Application implements State {
    private TV tv;

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