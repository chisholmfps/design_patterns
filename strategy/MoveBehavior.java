package strategy;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Abstract class for movement strategy.
 */
public abstract class MoveBehavior {
    protected static final int NUM_MOVES = 5;
    protected int speed;
    protected ArrayList<String> character;

    public MoveBehavior(ArrayList<String> character, int speed) {
        this.character = character;
        this.speed = speed;
    }

    public abstract void move();

    protected void move(boolean jump) {
        for (int i = 0; i < NUM_MOVES; i++) {
            clear();
            displayCharacter();
            sleep(300);

            for (int s = 0; s < speed; s++) {
                pushCharacterForward();
            }

            if (jump) {
                character.add(0, "");
                character.remove(character.size() - 1);
            }
        }
    }

    protected void pushCharacterForward() {
        for (int i = 0; i < character.size(); i++) {
            character.set(i, " " + character.get(i));
        }
    }

    protected void displayCharacter() {
        for (String line : character) {
            System.out.println(line);
        }
    }

    protected void sleep(int num) {
        try {
            TimeUnit.MILLISECONDS.sleep(num);
        } catch (Exception e) {
            System.out.println("Timer error");
        }
    }

    protected void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
