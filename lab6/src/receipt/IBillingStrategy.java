package receipt;

import components.Component;
import toppings.ISubComponent;

import java.util.List;

public interface IBillingStrategy {

    List<ISubComponent> generateBillItem(Component component);
}
