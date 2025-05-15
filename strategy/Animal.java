package strategy;

import java.util.ArrayList;

/**
 * Abstract base class representing a generic Animal.
 * Each animal has a name, a visual representation (character),
 * and a move behavior defined by the Strategy pattern.
 */
public abstract class Animal {
    protected String name;
    protected ArrayList<String> character;
    protected MoveBehavior moveBehavior;

    /**
     * Constructs an Animal with the given name.
     *
     * @param name The name of the animal.
     */
    public Animal(String name) {
        this.name = name;
        this.character = new ArrayList<>();
    }

    /**
     * Triggers the movement behavior of the animal.
     */
    public void move() {
        moveBehavior.move();
    }

    /**
     * Returns the animal's name.
     *
     * @return The name of the animal.
     */
    public String toString() {
        return name;
    }
}
