package state;
/**
 * The State interface defines the required actions for all TV states.
 */
public interface State {
    void pressHomeButton();
    void pressNetflixButton();
    void pressHuluButton();
    void pressMovieButton();
    void pressTVButton();
    void watch(String title);
}
