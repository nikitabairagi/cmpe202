import components.Burger;
import components.Component;
import components.Sandwich;
import receipt.PackingSlip;
import receipt.PaperReceipt;
import toppings.ComponentType;
import toppings.GrilledToppings;
import toppings.Toppings;

public class BuildOrder {

    public static void getOrder(){
        Order order = new Order();

        Burger burger = new Burger(3);

        ComponentType type = new ComponentType("Bacon");
        burger.subComponents.add(type);

        String[] toppinglist = new String[]{"Lettuce","Tomatoes"};
        Toppings toppings = new Toppings(toppinglist);
        burger.subComponents.add(toppings);

        String[] grillings = {"Onions","Mushrooms"};
        GrilledToppings grilledtoppings = new GrilledToppings(grillings);
        burger.subComponents.add(grilledtoppings);


        order.addChild(burger);

        Sandwich sandwich = new Sandwich( 2);
        ComponentType type1 = new ComponentType("Bacon cheese");
        sandwich.subComponents.add(type1);
        sandwich.subComponents.add(toppings);
        sandwich.subComponents.add(grilledtoppings);

        order.addChild(sandwich);

        System.out.println("\nPacking Slip");

        order.printBill(new PackingSlip());

        System.out.println("\nPaper Receipt");

        order.printBill(new PaperReceipt());

    }
}
