package Design_Patterns.Behavioral_DP.Observer_DP;

public interface Sublect {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
