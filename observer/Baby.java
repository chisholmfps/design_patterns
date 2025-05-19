package observer;

import java.util.ArrayList;
import java.util.Random;

/**
 * Baby is a subject that notifies its observers (the parents)
 * when it cries in different ways.
 */
public class Baby implements Subject {
    private String name;
    private ArrayList<Observer> observers = new ArrayList<>();
    private Random rand = new Random();

    /**
     * Creates a new Baby with the given name.
     * 
     * @param name the baby's name
     */
    public Baby(String name) {
        this.name = name;
    }

    /**
     * Returns the baby's name.
     * 
     * @return the name of the baby
     */
    public String getName() {
        return name;
    }

    /**
     * Simulates the baby receiving love.
     * Randomly prints one of two responses.
     */
    public void receiveLove() {
        if (rand.nextBoolean()) {
            System.out.println(name + " feels appreciated and loved.");
        } else {
            System.out.println(name + " pushes everyone away and continues to cry.");
        }
    }

    /**
     * Simulates the baby eating.
     * Randomly prints one of two responses.
     */
    public void eat() {
        if (rand.nextBoolean()) {
            System.out.println(name + " has a happy full tummy.");
        } else {
            System.out.println(name + " throws all his food on the floor.");
        }
    }

    /**
     * Simulates the baby getting a diaper change.
     */
    public void getChanged() {
        System.out.println(name + " is having a diaper change.");
    }

    /**
     * Simulates the baby crying angrily and notifies observers.
     */
    public void angryCry() {
        System.out.println("Waaaaaaaaa! " + name + " is feeling abandoned and angry.");
        notifyObservers(Cry.ANGRY);
    }

    /**
     * Simulates the baby crying from hunger and notifies observers.
     */
    public void hungryCry() {
        System.out.println("Neh Neh Neh! " + name + " is starving!!!");
        notifyObservers(Cry.HUNGRY);
    }

    /**
     * Simulates the baby crying because they are wet and notifies observers.
     */
    public void wetCry() {
        System.out.println("Aaaaaa! " + name + " is WET!");
        notifyObservers(Cry.WET);
    }

    /**
     * Adds an observer to this baby.
     *
     * @param observer the observer to register
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer from this baby.
     * @param observer the observer to remove
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifies all registered observers of the baby's cry.
     * @param cry the type of cry to notify about
     */
    @Override
    public void notifyObservers(Cry cry) {
        for (Observer observer : observers) {
            observer.update(cry, this);
        }
    }
}
