package observer;

import java.util.ArrayList;
import java.util.Random;

/**
 * Represents a baby that notifies observers when it cries.
 */
public class Baby implements Subject {
    private String name;
    private ArrayList<Observer> observers = new ArrayList<>();
    private Random rand = new Random();

    public Baby(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void receiveLove() {
        if (rand.nextBoolean()) {
            System.out.println(name + " feels appreciated and loved.");
        } else {
            System.out.println(name + " pushes everyone away and continues to cry.");
        }
    }

    public void eat() {
        if (rand.nextBoolean()) {
            System.out.println(name + " has a happy full tummy.");
        } else {
            System.out.println(name + " throws all his food on the floor.");
        }
    }

    public void getChanged() {
        System.out.println(name + " is having a diaper change.");
    }

    public void angryCry() {
        System.out.println("Waaaaaaaaa! " + name + " is feeling abandoned and angry.");
        notifyObservers(Cry.ANGRY);
    }

    public void hungryCry() {
        System.out.println("Neh Neh Neh! " + name + " is starving!!!");
        notifyObservers(Cry.HUNGRY);
    }

    public void wetCry() {
        System.out.println("Aaaaaa! " + name + " is WET!");
        notifyObservers(Cry.WET);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Cry cry) {
        for (Observer observer : observers) {
            observer.update(cry, this);
        }
    }
}
