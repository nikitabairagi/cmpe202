

public class NoCoinState implements State {
    GumballMachine gumballMachine;
 
    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    
    public void insertCoin(int coin) {
        System.out.println("You inserted a" + coin);
        
        if(gumballMachine.getMachineBalance() >= gumballMachine.getGumballCost()){
            
            gumballMachine.setState(gumballMachine.getHasCoinState());
        }
    }
 
    public void ejectCoin() {
        System.out.println("You haven't inserted a Coin");
    }
 
    public void turnCrank() {
        if(gumballMachine.getMachineBalance() !=0 ){
            System.out.println("Gumball Cost is 50.");
        }else{
            System.out.println("You turned, but there's no Coin");
        }
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        return "waiting for Coin";
    }
}

