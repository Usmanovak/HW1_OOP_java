public class HotDrinks {
    
    protected String name;
    protected int volume;
    protected int temperature;
    protected double price;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name){
        checkName(name);
    }   
    

    public int getVolume() {
        return volume;
    }
    
    public void setVolume(int volume){
        if (volume < 200){
            throw new RuntimeException("Выберите 200 мл или более.");
        }
        this.volume = volume;   
    }   

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature){
        if (temperature < 45 || temperature > 95){
            throw new RuntimeException("Выберите температуру от 45 гр. до 95 гр. Цельсия.");
        }
        this.temperature = temperature;   
    } 

    public double getPrice() { 
        return price;
    }
    
    public void setPrice(double price){
        if (price < 80){
            throw new RuntimeException("Некорректная цена товара.");
        }
        this.price = price;
    }   

    public HotDrinks(String name, int volume, int temperatume, double price){ 

        checkName(name); 
    }

    private void checkName(String name) {
        if (name == null || name.length() < 3){
        this.name = "Noname";
        }
        else {
            this.name = name;
        }
    }
  
    
    String displayInfo() {
        return String.format("%s - %d мл - %d градусов", name, volume, temperature);
    }
}
