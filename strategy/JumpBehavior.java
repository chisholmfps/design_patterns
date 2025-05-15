package strategy;

import java.util.ArrayList;

/**
 * causes the character to jump while moving.
 */
public class JumpBehavior extends MoveBehavior {

    /**
     * Constructs a JumpBehavior for the given character and speed.
     *
     * @param character The visual character lines.
     * @param speed     The speed of movement.
     */
    public JumpBehavior(ArrayList<String> character, int speed) {
        super(character, speed);
    }

    /**
     * Executes the jump-based movement.
     */
    @Override
    public void move() {
        move(true);
    }
}
