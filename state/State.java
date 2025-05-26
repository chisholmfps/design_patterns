package state;

public interface State {
    void pressHomeButton();
    void pressNetflixButton();
    void pressHuluButton();
    void pressMovieButton();
    void pressTVButton();
    void watch(String title);
}
