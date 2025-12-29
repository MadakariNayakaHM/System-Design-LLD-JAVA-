package Design_Patterns.Behavioral_DP.Observer_DP;

public class TvDisplay implements Observer{
    private String weather;

    @Override
    public void update(String Weather) {
        this.weather = Weather;
        display();

    }

    public void display()
    {
        System.out.println("updated weather " + weather);
    }
}
