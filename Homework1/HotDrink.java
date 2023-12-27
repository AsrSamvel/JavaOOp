package Homework1;

public class HotDrink extends Product {
    private int volume;
    private int temperature;

    public HotDrink(String name, double cost, int volume, int temperature) {
        super(name, cost);
        this.volume = volume;
        this.temperature = temperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String toString() {
        return String.format("HotDrink{name='%s',cost=%f, volume=%d, temperature=%d}", super.getName(),
                super.getCost(), volume, temperature);

    }

}