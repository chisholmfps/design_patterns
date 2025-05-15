package strategy;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Abstract base class for all movement behaviors.
 * Defines the shared behavior for moving an animal on screen.
 */
public abstract class MoveBehavior {
    protected static final int NUM_MOVES = 5;
    protected int speed;
    protected ArrayList<String> character;

    /**
     * Constructs a MoveBehavior with the character to move and a speed.
     *
     * @param character The visual representation of the animal.
     * @param speed     How fast the animal moves.
     */
    public MoveBehavior(ArrayList<String> character, int speed) {
        this.character = character;
        this.speed = speed;
    }

    /**
     * Abstract method to be implemented by concrete movement types.
     */
    public abstract void move();

    /**
     * Moves the character on screen with optional jumping behavior.
     *
     * @param jump True if the character should jump while moving.
     */
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

    /**
     * Shifts each line of the character one space to the right.
     */
    protected void pushCharacterForward() {
        for (int i = 0; i < character.size(); i++) {
            character.set(i, " " + character.get(i));
        }
    }

    /**
     * Displays the character's visual lines to the console.
     */
    protected void displayCharacter() {
        for (String line : character) {
            System.out.println(line);
        }
    }

    /**
     * Pauses the program for a given number of milliseconds.
     *
     * @param num The number of milliseconds to sleep.
     */
    protected void sleep(int num) {
        try {
            TimeUnit.MILLISECONDS.sleep(num);
        } catch (Exception e) {
            System.out.println("Timer error");
        }
    }

    /**
     * Clears the console.
     */
    protected void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
