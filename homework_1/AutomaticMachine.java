import java.util.List;


public class AutomaticMachine {
    
    private List <HotDrinks> drinks;

    public AutomaticMachine(List <HotDrinks> drinks) {
        this.drinks = drinks;
    }

    public CupOfMilk getCupOfMilk(String name, int volume, int temperature) {
        for (HotDrinks drink : drinks) {
            if (drink instanceof CupOfMilk) {
                CupOfMilk cupOfMilk = (CupOfMilk) drink;
                if (drink.getName().equals(name) && cupOfMilk.getVolume() == volume && cupOfMilk.getTemperature() == temperature) {
                    return cupOfMilk;
                }
            }
        }
        return null;
    }

    public CupOfCoffee getCupOfCoffee(String name, int volume, int temperature) {
        for (HotDrinks drink : drinks) {
            if (drink instanceof CupOfCoffee) {
                CupOfCoffee cupOfCoffee = (CupOfCoffee) drink;
                if (drink.getName().equals(name) && cupOfCoffee.getVolume() == volume && cupOfCoffee.getTemperature() == temperature) {
                    return cupOfCoffee;
                }
            }
        }
        return null;
    }

    public CupOfTea getCupOfTea(String name, int volume, int temperature) {
        for (HotDrinks drink : drinks) {
            if (drink instanceof CupOfTea) {
                CupOfTea cupOfTea = (CupOfTea) drink;
                if (drink.getName().equals(name) && cupOfTea.getVolume() == volume && cupOfTea.getTemperature() == temperature) {
                    return cupOfTea;
                }
            }
        }
        return null;
    }
}

