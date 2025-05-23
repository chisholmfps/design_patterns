package observer;
/**
 * Subject interface for the observer pattern.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(Cry cry);
}
