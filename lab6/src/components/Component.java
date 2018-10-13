package components;

import toppings.ComponentType;
import toppings.ISubComponent;

import java.util.ArrayList;
import java.util.List;

public class Component {

    int quantity;
    public List<ISubComponent> subComponents;

    public Component(int quantity){
        this.quantity = quantity;
        subComponents = new ArrayList<>();
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice(){

        for( ISubComponent subComponent: subComponents){
            if(subComponent instanceof ComponentType){
                return  ((ComponentType) subComponent).getPrice();
            }
        }

        return 0.0;
    }

}
