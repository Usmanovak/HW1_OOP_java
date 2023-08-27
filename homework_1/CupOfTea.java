public class CupOfTea extends HotDrinks {
    
    
    private int volume;
    private int temperature;

    public int getVolume() {
        return volume;
    }

    public int getTemperature() {
        return temperature;
    }


    public CupOfTea(String name, int volume , int temperature, double price) {
        super(name, volume, temperature, price);
        this.volume = volume;
        this.temperature = temperature;
        this.price = price;
    }

    public String displayInfo() {
        return String.format("[Чай] %s - %d мл - %d градусов", name, volume, temperature);
    }
}