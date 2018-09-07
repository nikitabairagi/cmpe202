
/**
 * Write a description of class GumballMachine3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GumballMachine1
{

    private int num_gumballs;
    private boolean has_cent;
    private int balance;
 
 
    public GumballMachine1(int size)
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_cent = false;
        this.balance = 0;

    }

    public void insertCoin(int coin)
    {
        if(coin == 25){
            this.balance += coin ;
            this.has_cent = true;
        }else{
           System.out.println("Not valid coin.Insert a quarter");
       }
   
    }
   
    public void turnCrank(){
        if ( this.has_cent )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.balance--;
                if(balance == 0){
                    this.has_cent = false ;
                }
                System.out.println( "Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else 
        {
                System.out.println( "Please insert a quarter" ) ;
            
        }      
    }
}
