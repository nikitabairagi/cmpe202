package receipt;

import components.Component;
import toppings.ISubComponent;

import java.util.List;

public class PaperReceipt implements IBillingStrategy {

    public List<ISubComponent> generateBillItem(Component component) {
        return component.subComponents;
    }
}
