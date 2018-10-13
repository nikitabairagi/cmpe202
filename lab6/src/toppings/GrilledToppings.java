package toppings;

public class GrilledToppings implements ISubComponent {

    String[] toppingList;

    public GrilledToppings(String[] toppingList){

        this.toppingList = toppingList;
    }

    @Override
    public void print() {
        for(String topping : toppingList){
            System.out.println("-> | " + topping.toUpperCase());
        }
    }
}
