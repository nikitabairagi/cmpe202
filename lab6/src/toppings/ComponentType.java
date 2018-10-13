package toppings;

public class ComponentType implements ISubComponent {

    String type;

    public ComponentType(String type){
        this.type = type;
    }

    @Override
    public void print() {
        System.out.println("{{{{"+ type + "}}}}");
    }

    public double getPrice(){
        double price = 0.0;

        //since toppings are free
        //price is only dependent to burger type or sandwich type
        switch (type.toLowerCase()){

            case "bacon":
                price = 5.50;
                break;
            case "cheese":
                price = 3.50;
                break;
            case "ham":
                price = 6.50;
                break;
            case "bacon cheese":
                price = 7.50;
                break;
            default:
                price = 5.50;
        }

        return price;
    }
}
