/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private IDisplayComponent num;
    private IDisplayComponent exp;
    private CreditCardCVC cvc;
    private int count;

    public App() {

        screen = new Screen();
        num = new SpaceDecorator(new CreditCardNum());
        exp = new SlashDecorator(new CreditCardExp());
        cvc = new CreditCardCVC();

        screen.addSubComponent(num);
        screen.addSubComponent(exp);
        screen.addSubComponent(cvc);

        count = 0;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {
        if(ch.equals("Delete") || ch.equalsIgnoreCase("X")){
            screen.key(ch, count);
            count --;
//            if(count == 4 || count == 8 || count == 12){
//                count --;
//            }
        }else if(ch.matches("[0-9]+") && ch.length() == 1 && count <= 22){
            count++;
            screen.key(ch, count);

        }



    }

}

