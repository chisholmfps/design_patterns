package observer;

import java.util.ArrayList;
import java.util.Random;

/**
 * Abstract Observer class to be extended by Mom and Dad.
 */
public abstract class Observer {
    protected Random rand = new Random();

    public Observer(ArrayList<Baby> babies) {
        for (Baby baby : babies) {
            baby.registerObserver(this);
        }
    }

    public abstract void update(Cry cry, Baby baby);
}
