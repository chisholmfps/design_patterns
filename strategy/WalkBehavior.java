package strategy;

import java.util.ArrayList;

/**
 * causes the character to walk forward.
 */
public class WalkBehavior extends MoveBehavior {

    /**
     * Constructs a WalkBehavior for the given character and speed.
     *
     * @param character The visual character lines.
     * @param speed     The speed of movement.
     */
    public WalkBehavior(ArrayList<String> character, int speed) {
        super(character, speed);
    }

    /**
     * Executes the walk-based movement.
     */
    @Override
    public void move() {
        move(false);
    }
}
