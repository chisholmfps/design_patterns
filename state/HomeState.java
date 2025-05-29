package state;

/**
 * HomeState is the default state of the TV.
 */
public class HomeState extends Application implements State {
    private TV tv;

    /**
     * Constructs a HomeState object with a reference to the TV.
     * @param tv the context TV object
     */
    public HomeState(TV tv) {
        this.tv = tv;
    }

    @Override
    public void pressHomeButton() {
        System.out.println("You are already on the Home screen.");
    }

    @Override
    public void pressNetflixButton() {
        System.out.println("Loading Netflix...");
        tv.setState(tv.getNetflixState());
    }

    @Override
    public void pressHuluButton() {
        System.out.println("Loading Hulu...");
        tv.setState(tv.getHuluState());
    }

    @Override
    public void pressMovieButton() {
        System.out.println("You must pick Netflix or Hulu to watch movies.");
    }

    @Override
    public void pressTVButton() {
        System.out.println("You must pick Netflix or Hulu to watch TV shows.");
    }

    @Override
    public void watch(String title) {
        System.out.println("You must pick Netflix or Hulu to watch something.");
    }
}