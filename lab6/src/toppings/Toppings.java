package toppings;

public class Toppings implements ISubComponent {

    String[] toppingList;

    public Toppings(String[] toppingList){

        this.toppingList = toppingList;
    }

    @Override
    public void print() {
        for(String topping : toppingList){
            System.out.println(topping.toUpperCase());
        }
    }
}
