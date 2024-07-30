package impl;

public class HotDrink extends Product {
    private int temperature;
    private float volume;
    private String name;

    public HotDrink(String name, float volume, int temperature) {
        super(name, volume, temperature);
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public float getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "HotDrink{" +
               "name='" + name + '\'' +
               ", volume=" + volume +
               ", temperature=" + temperature +
               '}';
    }


}
