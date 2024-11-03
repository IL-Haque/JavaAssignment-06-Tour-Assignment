class WeatherForecast {
    private String day;
    private double temperature;
    private String weatherCondition;

    public WeatherForecast(String day, double temperature, String weatherCondition) {
        this.day = day;
        this.temperature = temperature;
        this.weatherCondition = weatherCondition;
    }

    public void displayForecast() {
        System.out.printf("%s: %.1f°C, %s%n", day, temperature, weatherCondition);
    }
}
