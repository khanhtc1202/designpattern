package ObserverPattern.concretes;

import ObserverPattern.interfaces.DisplayElement;
import ObserverPattern.interfaces.Observer;
import ObserverPattern.interfaces.Subject;

/**
 * Created by khanhtc on 2/21/17.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float huminity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current temperature : "+this.temperature);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {

    }
}
