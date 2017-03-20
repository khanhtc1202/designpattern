package ObserverPattern.interfaces;

/**
 * Created by khanhtc on 2/21/17.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
