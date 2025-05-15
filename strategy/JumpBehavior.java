package strategy;

import java.util.ArrayList;

/**
 * Movement strategy that simulates jumping movement.
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
     * Executes the jump animation: up and down with forward movement.
     */
    @Override
    public void move() {
        for (int i = 0; i < NUM_MOVES; i++) {
            clear();

            ArrayList<String> jumped = new ArrayList<>();
            jumped.add(""); // Adds vertical lift
            jumped.addAll(character);
            displayCustom(jumped);
            sleep(150);

            clear();

            displayCharacter();
            sleep(150);

            for (int s = 0; s < speed; s++) {
                pushCharacterForward();
            }
        }
    }
}
