package observermode;

import com.google.common.collect.Lists;

import java.util.ArrayList;

import lombok.Data;

/**
 * @Author: Loong
 * @Description
 * @Date: 2019/5/24 13:22
 */
@Data
public class WeatherData implements Subject {
    private ArrayList observers;

    private float temperature;

    private float humidity;

    private float pressure;

    public WeatherData() {
        observers = Lists.newArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int indexOf = observers.indexOf(o);
        if (indexOf >= 0) {
            observers.remove(o);
        }
    }

    /**
     * 这是推的方式
     *
     */
    @Override
    public void notifyObservers() {
        observers.forEach(x->{
            Observer observer = (Observer)x;
            observer.update(temperature, humidity, pressure);
        });
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
