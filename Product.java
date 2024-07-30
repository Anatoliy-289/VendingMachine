public class Product{

    protected String name;
    protected double price;
    protected LocalDate releaseDate;


    protected float volume;
    protected int temperature;

    public Product(String name, double price, LocalDate releaseDate) {
        this.name = name;
        this.priсe = price;
        this.releaseDate = releaseDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }



    public Product(String name, float volume, int temperature) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


    public String getName() {
        return name;
    }
    
    public float getVolume() {
        return volume;
    }

    public int getTemperature() {
        return temperature;
    }


    @Override
    public String toString() {
        return "Product{" +
               "name='" + name + '\'' +
               ", price=" + price +
               ", releaseDate=" + releaseDate +
               '}';
    }


    @Override
    public String toString() {
        return "Product{" +
               "name='" + name + '\'' +
               ", volume=" + volume +
               ", temperature=" + temperature +
               '}';
    }

}