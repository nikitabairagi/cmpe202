public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine1 = new GumballMachine1(10);
        GumballMachine gumballMachine2 = new GumballMachine2(10);
        GumballMachine gumballMachine3 = new GumballMachine3(10);
        
        System.out.println(gumballMachine1);
        
        gumballMachine1.insertCoin(25);
        gumballMachine1.insertCoin(25);
        gumballMachine1.insertCoin(10);
        gumballMachine1.insertCoin(5);
        gumballMachine1.turnCrank();
        gumballMachine1.turnCrank();
        gumballMachine1.turnCrank();
        
        System.out.println(gumballMachine2);
        
        gumballMachine2.insertCoin(25);
        gumballMachine2.insertCoin(10);
        gumballMachine2.turnCrank();
        gumballMachine2.insertCoin(25);
        gumballMachine2.turnCrank();
        gumballMachine2.turnCrank();
        
        System.out.println(gumballMachine3);
        
        gumballMachine3.insertCoin(10);
        gumballMachine3.insertCoin(10);
        gumballMachine3.turnCrank();
        gumballMachine3.insertCoin(5);
        gumballMachine3.insertCoin(25);
        gumballMachine3.insertCoin(25);
        gumballMachine3.turnCrank();
        gumballMachine3.turnCrank();
        gumballMachine1.turnCrank();
        
        
        



    }
}
