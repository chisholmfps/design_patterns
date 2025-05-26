package state;

public class TV {
    private State homeState;
    private State netflixState;
    private State huluState;
    private State state;

    public TV() {
        homeState = new HomeState(this);
        netflixState = new NetflixState(this);
        huluState = new HuluState(this);
        state = homeState;
    }

    public String pressHomeButton() {
        state.pressHomeButton();
        return "";
    }

    public String pressNetflixButton() {
        state.pressNetflixButton();
        return "";
    }

    public String pressHuluButton() {
        state.pressHuluButton();
        return "";
    }

    public String pressMovieButton() {
        state.pressMovieButton();
        return "";
    }

    public String pressTVButton() {
        state.pressTVButton();
        return "";
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getHomeState() {
        return homeState;
    }

    public State getNetflixState() {
        return netflixState;
    }

    public State getHuluState() {
        return huluState;
    }

    public void watch(String title) {
        state.watch(title);
    }
}
