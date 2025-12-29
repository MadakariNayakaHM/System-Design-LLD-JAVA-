package Design_Patterns.Behavioral_DP.Observer_DP;

public class WeatherApplication {
    static void main() {
        WeatherStation ws = new WeatherStation();
        MobileDisplay md = new MobileDisplay();
        TvDisplay td = new TvDisplay();

        ws.addObserver(md);
        ws.addObserver(td);
        ws.setWeather("Rainy");
        ws.removeObserver(td);
        ws.setWeather("Rainy");

    }


}
