
public class CupOfChocolate extends HotDrinks {
    
    
    private int volume;
    private int temperature;

    public int getVolume() {
        return volume;
    }

    public int getTemperature() {
        return temperature;
    }


    public CupOfChocolate(String name, int volume , int temperature, double price) {
        super(name, volume, temperature, price);
        this.volume = volume;
        this.temperature = temperature;
        this.price = price;
    }

    public String displayInfo() {
        return String.format("[Шоколад] %s - %d мл - %d градусов", name, volume, temperature);
    }
}