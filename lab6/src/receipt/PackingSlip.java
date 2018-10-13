package receipt;

import components.Component;
import toppings.ComponentType;
import toppings.GrilledToppings;
import toppings.ISubComponent;
import toppings.Toppings;

import java.util.LinkedList;
import java.util.List;

public class PackingSlip implements IBillingStrategy {

    @Override
    public List<ISubComponent> generateBillItem(Component component) {


        ISubComponent type = null;
        ISubComponent grilledToppings = null;
        ISubComponent toppings = null;

        for(ISubComponent subComponent: component.subComponents){
            if(subComponent instanceof Toppings){
                toppings = subComponent;
            }else if(subComponent instanceof GrilledToppings){
                grilledToppings = subComponent;
            }else if(subComponent instanceof ComponentType){
                type = subComponent;
            }
        }

        //linked list for maintaining the order
        List<ISubComponent> subComponents = new LinkedList<>();
        subComponents.add(toppings);
        subComponents.add(grilledToppings);
        subComponents.add(type);

        return subComponents;
    }
}
