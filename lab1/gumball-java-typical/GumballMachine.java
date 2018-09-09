import java.util.* ;

public class GumballMachine
{
    private int num_gumballs;
    private int balance;
    private int gumball_cost;
    private boolean has_coin;
    private List<Integer> denomination_accepted;

    
    public GumballMachine(int num_gumballs,int gumball_cost,Integer[] denomination_accepted)
    {
        //assuming the gumball machine has no coins in the start
        this.has_coin = false;
        this.num_gumballs = num_gumballs;
        this.gumball_cost = gumball_cost;
        this.denomination_accepted = Arrays.asList(denomination_accepted);
    
    }

    public boolean isValidInput(int coin){
        
        return denomination_accepted.contains(coin);
        
    }
    
    public void insertCoin(int coin)
    {
        if(this.has_coin){
            System.out.println("You cannot insert another coin.");
        }else{
            if(isValidInput(coin)){
               System.out.println(coin+  ", Coin Accepted");
               balance += coin;   
               this.has_coin = true;
            }else{
                System.out.println("Insert a valid coin");
            }
        }
    }
    
    public void turnCrank(){
        if(this.has_coin){
            this.has_coin = false;
        }
        if(balance >= gumball_cost){
            
            if(num_gumballs > 0){                
                num_gumballs--;
                balance-= gumball_cost;
                System.out.println("Gumball Ejected!");
                
            }else{
                
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }else if(balance == 0){
            
            System.out.println("Insert a coin");
        }else{
            
            System.out.println("Your balance is:"+ balance +" Insert more coins");
        }     
    }
}
