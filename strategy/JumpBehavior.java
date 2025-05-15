package strategy;

import java.util.ArrayList;

/**
 * Move behavior that jumps
 */
public class JumpBehavior extends MoveBehavior {

    public JumpBehavior(ArrayList<String> character, int speed) {
        super(character, speed);
    }

    @Override
    public void move() {
        move(true);
    }
}
