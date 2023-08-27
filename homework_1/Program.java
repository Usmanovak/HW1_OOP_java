import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        CupOfChocolate cupOfChocolate1 = new CupOfChocolate("Горячий шоколад", 200, 95, 90);
        System.out.println(cupOfChocolate1.displayInfo());

        CupOfChocolate cupOfChocolate2 = new CupOfChocolate("Горячий шоколад", 250, 95, 110);
        System.out.println(cupOfChocolate2.displayInfo());

        CupOfChocolate cupOfChocolate3 = new CupOfChocolate("Горячий шоколад", 500, 95, 150);
        System.out.println(cupOfChocolate3.displayInfo());

        CupOfChocolate cupOfChocolate4 = new CupOfChocolate("Теплый шоколад", 200, 85, 90);
        System.out.println(cupOfChocolate4.displayInfo());

        CupOfChocolate cupOfChocolate5 = new CupOfChocolate("Теплый шоколад", 250, 85, 110);
        System.out.println(cupOfChocolate5.displayInfo());

        CupOfChocolate cupOfChocolate6 = new CupOfChocolate("Теплый шоколад", 500, 85, 150);
        System.out.println(cupOfChocolate6.displayInfo());



        CupOfCoffee cupOfCoffee1 = new CupOfCoffee("Эспрессо", 200, 90, 90);
        System.out.println(cupOfCoffee1.displayInfo());

        CupOfCoffee cupOfCoffee2 = new CupOfCoffee("Американо", 250, 90, 110);
        System.out.println(cupOfCoffee2.displayInfo());

        CupOfCoffee cupOfCoffee3 = new CupOfCoffee("Капучино", 250, 90, 110);
        System.out.println(cupOfCoffee3.displayInfo());

        CupOfCoffee cupOfCoffee4 = new CupOfCoffee("Капучино", 500, 90, 150);
        System.out.println(cupOfCoffee4.displayInfo());

        CupOfCoffee cupOfCoffee5 = new CupOfCoffee("Латте", 250, 90, 110);
        System.out.println(cupOfCoffee5.displayInfo());

        CupOfCoffee cupOfCoffee6 = new CupOfCoffee("Латте", 500, 90, 150);
        System.out.println(cupOfCoffee6.displayInfo());


        CupOfTea cupOfTea1 = new CupOfTea("Горячий чай", 200, 95, 80);
        System.out.println(cupOfTea1.displayInfo());

        CupOfTea cupOfTea2 = new CupOfTea("Горячий чай", 250, 95, 90);
        System.out.println(cupOfTea2.displayInfo());

        CupOfTea cupOfTea3 = new CupOfTea("Горячий чай", 500, 95, 100);
        System.out.println(cupOfTea3.displayInfo());

        CupOfTea cupOfTea4 = new CupOfTea("Холодный чай", 200, 40, 80);
        System.out.println(cupOfTea4.displayInfo());

        CupOfTea cupOfTea5 = new CupOfTea("Холодный чай", 250, 40, 90);
        System.out.println(cupOfTea5.displayInfo());

        CupOfTea cupOfTea6 = new CupOfTea("Холодный чай", 500, 40, 100);
        System.out.println(cupOfTea6.displayInfo());


        CupOfMilk cupOfMilk1 = new CupOfMilk("Горячее молоко", 200, 85, 80);
        System.out.println(cupOfMilk1.displayInfo());

        CupOfMilk cupOfMilk2 = new CupOfMilk("Горячее молоко", 250, 85, 90);
        System.out.println(cupOfMilk2.displayInfo());

        CupOfMilk cupOfMilk3 = new CupOfMilk("Горячее молоко", 500, 85, 100);
        System.out.println(cupOfMilk3.displayInfo());

        CupOfMilk cupOfMilk4 = new CupOfMilk("Холодное молоко", 200, 45, 80);
        System.out.println(cupOfMilk4.displayInfo());

        CupOfMilk cupOfMilk5 = new CupOfMilk("Холодное молоко", 250, 45, 90);
        System.out.println(cupOfMilk5.displayInfo());

        CupOfMilk cupOfMilk6 = new CupOfMilk("Холодное молоко", 500, 45, 100);
        System.out.println(cupOfMilk6.displayInfo());

        List<HotDrinks> drinks = new ArrayList<>();
        drinks.add(cupOfChocolate1);
        drinks.add(cupOfChocolate2);
        drinks.add(cupOfChocolate3);
        drinks.add(cupOfChocolate4);
        drinks.add(cupOfChocolate5);
        drinks.add(cupOfChocolate6);
        drinks.add(cupOfCoffee1);
        drinks.add(cupOfCoffee2);
        drinks.add(cupOfCoffee3);
        drinks.add(cupOfCoffee4);
        drinks.add(cupOfCoffee5);
        drinks.add(cupOfCoffee6);
        drinks.add(cupOfMilk1);
        drinks.add(cupOfMilk2);
        drinks.add(cupOfMilk3);
        drinks.add(cupOfMilk4);
        drinks.add(cupOfMilk5);
        drinks.add(cupOfMilk6);
        drinks.add(cupOfTea1);
        drinks.add(cupOfTea2);
        drinks.add(cupOfTea3);
        drinks.add(cupOfTea4);
        drinks.add(cupOfTea5);
        drinks.add(cupOfTea6);

        AutomaticMachine automaticMachine = new AutomaticMachine(drinks);
        CupOfMilk cupOfMilk = automaticMachine.getCupOfMilk("Горячее молоко", 200, 85);
        if (cupOfMilk != null) {
            System.out.println("Вы купили: ");
            System.out.println(cupOfMilk.displayInfo());
        }
        else {
            System.out.println("Такого молока нет в автомате");
        }

        // AutomaticMachine automaticMachine1 = new AutomaticMachine(drinks);
        // CupOfCoffee cupOfСoffee = automaticMachine1.getCupOfCoffee("Капучино", 250, 95);
        // if (cupOfСoffee != null) {
        //     System.out.println("Вы купили: ");
        //     System.out.println(cupOfСoffee.displayInfo());
        // }
        // else {
        //     System.out.println("Такого кофе нет в автомате");
        // }

        // AutomaticMachine automaticMachine2 = new AutomaticMachine(drinks);
        // CupOfTea cupOfTea = automaticMachine2.getCupOfTea("Горячий чай", 500, 95);
        // if (cupOfСoffee != null) {
        //     System.out.println("Вы купили: ");
        //     System.out.println(cupOfTea.displayInfo());
        // }
        // else {
        //     System.out.println("Такого чая нет в автомате");
        // }
    }
}
