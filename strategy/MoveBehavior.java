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
     * Displays a temporary visual (e.g., a jump frame).
     *
     * @param lines The lines to display.
     */
    protected void displayCustom(ArrayList<String> lines) {
        for (String line : lines) {
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
