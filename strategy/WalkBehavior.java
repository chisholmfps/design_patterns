package strategy;

import java.util.ArrayList;

/**
 * Move behavior that walks
 */
public class WalkBehavior extends MoveBehavior {

    public WalkBehavior(ArrayList<String> character, int speed) {
        super(character, speed);
    }

    @Override
    public void move() {
        move(false);
    }
}
