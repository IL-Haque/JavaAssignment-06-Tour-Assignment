public class  WeatherForecastRunner  {
    public static void main(String[] args) {

        WeatherForecast[] forecast = new WeatherForecast[3];
        forecast[0] = new WeatherForecast("Monday", 25.0, "Sunny");
        forecast[1] = new WeatherForecast("Tuesday", 22.0, "Rainy");
        forecast[2] = new WeatherForecast("Wednesday", 24.0, "Partly Cloudy");

        System.out.println("Weather Forecast for the Tour:");
        for (WeatherForecast dayForecast : forecast) {
            dayForecast.displayForecast();
        }
    }
}
