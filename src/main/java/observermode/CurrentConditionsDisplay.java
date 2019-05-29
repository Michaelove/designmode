package observermode;

/**
 * @Author: Loong
 * @Description
 * @Date: 2019/5/24 13:35
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;

    private float humidity;

    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("show something");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("update some attribute");
        display();
    }
}
