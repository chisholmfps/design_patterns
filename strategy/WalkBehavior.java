package strategy;

import java.util.ArrayList;

/**
 * Movement strategy that causes the character to walk forward.
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
     * Executes the walk animation with forward motion.
     */
    @Override
    public void move() {
        for (int i = 0; i < NUM_MOVES; i++) {
            clear();
            displayCharacter();
            sleep(300);

            for (int s = 0; s < speed; s++) {
                pushCharacterForward();
            }
        }
    }
}
