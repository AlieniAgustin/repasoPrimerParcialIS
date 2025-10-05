import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestObservers {

    @Test
    public void testThreeObservers() {
        WeatherData weatherData = new WeatherData();

        Observer currentDisplay =
                new CurrentConditionsDisplay(weatherData);
        Observer statisticsDisplay = new StatisticsDisplay(weatherData);
        Observer forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }

    @Test
    public void testRemoveObserver() {
        WeatherData weatherData = new WeatherData();

        Observer currentDisplay =
                new CurrentConditionsDisplay(weatherData);
        Observer statisticsDisplay = new StatisticsDisplay(weatherData);
        Observer forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(62, 90, 28.1f);
    }

    @Test
    public void testCelsius(){
        WeatherData weatherData = new WeatherData();
        Observer celsiusDisplay = new CelsiusDisplay(weatherData);
        weatherData.setMeasurements(68,2,2);
    }

    @Test 
    public void testHeatIndex(){
        WeatherData weatherData = new WeatherData();
        Observer heatIndex = new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(86,70,2);
    }

}
