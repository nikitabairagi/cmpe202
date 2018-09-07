import java.util.*;

public class GumballMachine {
 
    State soldOutState;
    State noCoinState;
    State hasCoinState;
    State soldState;
 
    State state = soldOutState;
    int count = 0;
    int machine_balance = 0;
    int gumball_cost;
    List<Integer> denomination_accepted;
 
    public GumballMachine(int numberGumballs,int gumball_cost, Integer[] denomination_accepted) {
        soldOutState = new SoldOutState(this);
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noCoinState;
        } 
        
        this.gumball_cost = gumball_cost;
        this.denomination_accepted = Arrays.asList(denomination_accepted);
    }
    
    public boolean isValidCoin(int coin){
        return denomination_accepted.contains(coin);
        
    }
    public void insertCoin(int coin) {
        
        if(isValidCoin(coin)){
            machine_balance += coin;
            state.insertCoin(coin);
        }else if(this.state == hasCoinState){
            System.out.println("You can't insert another coin");
        }else{
            System.out.println("Please insert a valid coin");
        }
    }
 
    public void ejectCoin() {
        state.ejectCoin();
    }
 
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }
 
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
        if(machine_balance >= gumball_cost){
             machine_balance -= gumball_cost;
        }
    }
 
    int getCount() {
        return count;
    }
    int getMachineBalance(){
        return machine_balance;
    }
    void setMachineBalance(int new_balance){
        machine_balance = new_balance;
    }
    int getGumballCost(){
        return gumball_cost;
    }
  
    void refill(int count) {
        this.count = count;
        state = noCoinState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }
 
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
