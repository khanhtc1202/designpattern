package ObserverPattern.concretes;

import ObserverPattern.interfaces.Observer;
import ObserverPattern.interfaces.Subject;

import java.util.ArrayList;

/**
 * Created by khanhtc on 2/21/17.
 */
public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = this.observers.indexOf(o);
        if (i >= 0) {
            this.observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < this.observers.size(); i++) {
            Observer observer = (Observer)this.observers.get(i);
            observer.update(this.temperature, this.humidity, this.pressure);
        }
    }

    public void measurementsChanged () {
        this.notifyObservers();
    }

    public void setMeasurements (float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }
}
