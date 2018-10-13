import components.Burger;
import components.Component;
import components.Sandwich;
import receipt.IBillingStrategy;
import receipt.PaperReceipt;
import toppings.ISubComponent;

import java.util.ArrayList;
import java.util.List;

public class Order {

    List<Component> order;

    public Order(){
        order = new ArrayList<>();
    }

    public void addChild(Component c){
        order.add(c);
    }

    public void printBill(IBillingStrategy strategy){

        System.out.println("#################################");
        double price = 0.0;
        boolean showPrice = strategy instanceof PaperReceipt;

        for(Component component : order){
            double componentPrice = component.getPrice() * component.getQuantity();

            price += componentPrice;

            if(component instanceof Burger){
                System.out.println("\nBurger# " +
                        component.getQuantity() +
                        (showPrice ? "              " + componentPrice : "") );

            }else if(component instanceof Sandwich){
                System.out.println("\nSandwich# " +
                        component.getQuantity() +
                        (showPrice ? "           " + componentPrice : "") );
            }

            if(component.subComponents != null){
                for(ISubComponent subComponent : strategy.generateBillItem(component)){
                    subComponent.print();
                }
            }
        }

        if(showPrice){
            System.out.println("Sub. total            $" + price);

        }

        System.out.println("#################################");
    }
}
