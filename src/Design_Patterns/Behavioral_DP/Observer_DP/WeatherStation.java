package Design_Patterns.Behavioral_DP.Observer_DP;

import java.util.List;
import java.util.ArrayList;

public class WeatherStation implements Sublect{

    private List<Observer> observers = new ArrayList<>();
    private String Weather = "45";

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Added observer");

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("Removed observer");

    }

    @Override
    public void notifyObservers() {

        for(Observer observer : observers)
        {
            observer.update(Weather);
        }

    }


    public void setWeather(String newWeather) {
        this.Weather = newWeather;
        notifyObservers();
    }

}
