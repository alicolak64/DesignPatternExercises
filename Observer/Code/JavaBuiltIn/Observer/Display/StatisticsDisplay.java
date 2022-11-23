public class StatisticsDisplay implements Observer,DisplayElement {

    private Observable observable;
    private int numReadings;
    private float sumTemperature;
    private float sumHumidity;
    private float maxTemperature;
    private float minTemperature;
    private float maxHumidity;
    private float minHumidity;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
        numReadings = 0;
        sumTemperature = 0;
        sumHumidity = 0;
        maxTemperature = 0;
        minTemperature = 0;
        maxHumidity = 0;
        minHumidity = 0;
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            float temperature = weatherData.getTemperature();
            float humidity = weatherData.getHumidity();
            sumTemperature += temperature;
            sumHumidity += humidity;
            numReadings++;

            if (numReadings == 1) {
                maxTemperature = temperature;
                minTemperature = temperature;
                maxHumidity = humidity;
                minHumidity = humidity;
            } else {
                if (temperature > maxTemperature) {
                    maxTemperature = temperature;
                }
                if (temperature < minTemperature) {
                    minTemperature = temperature;
                }
                if (humidity > maxHumidity) {
                    maxHumidity = humidity;
                }
                if (humidity < minHumidity) {
                    minHumidity = humidity;
                }
            }

            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (sumTemperature / numReadings)
                + "/" + maxTemperature + "/" + minTemperature);
        System.out.println("Avg/Max/Min humidity = " + (sumHumidity / numReadings)
                + "/" + maxHumidity + "/" + minHumidity);
    }

}
