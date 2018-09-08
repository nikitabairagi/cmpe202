

public class NoCoinState implements State {
    GumballMachine gumballMachine;
 
    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    
    public void insertCoin(int coin) { 
        System.out.println("You inserted a " + coin);
        gumballMachine.setState(gumballMachine.getHasCoinState());
        gumballMachine.setMachineBalance(gumballMachine.getMachineBalance() + coin);
        
    }
 
    public void ejectCoin() {
        System.out.println("You haven't inserted a Coin");
    }
 
    public void turnCrank() {
       if(gumballMachine.getMachineBalance()==0){
           System.out.println("You turned, but there's no Coin");
        }else{
           System.out.println("No gumball dispensed.Insert coin");
        }
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        return "waiting for Coin";
    }
}

