public class Main {
    public static void main(String[] args) {
        GumballMachine1 gumballMachine1 = new GumballMachine1(10);
        GumballMachine2 gumballMachine2 = new GumballMachine2(10);
        GumballMachine3 gumballMachine3 = new GumballMachine3(10);
        
        System.out.println(gumballMachine1);
        
        gumballMachine1.insertCoin(25);
        gumballMachine1.turnCrank();
        
        System.out.println(gumballMachine2);
        
        gumballMachine2.insertCoin(25);
        gumballMachine2.insertCoin(10);
        gumballMachine2.turnCrank();
        gumballMachine2.insertCoin(25);
        gumballMachine2.turnCrank();
        
        System.out.println(gumballMachine3);
        
        gumballMachine3.insertCoin(10);
        gumballMachine3.insertCoin(10);
        gumballMachine3.turnCrank();
        gumballMachine3.insertCoin(5);
        gumballMachine3.insertCoin(25);
        gumballMachine3.insertCoin(10);
        gumballMachine3.turnCrank();
        
        



    }
}
