public class CelsiusDisplay implements Observer, DisplayElement {
	private float temperatureInCelsius;
	private WeatherData weatherData;
		
	public CelsiusDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
    this.weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure) {
		this.temperatureInCelsius = (5/(float) 9) * (temperature - 32);
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperatureInCelsius 
			+ "C degrees");
	}
}
