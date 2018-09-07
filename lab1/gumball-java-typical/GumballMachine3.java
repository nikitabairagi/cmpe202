
/**
 * Write a description of class GumballMachine2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GumballMachine3
{

    private int num_gumballs;
    private boolean has_cent;
    private int balance;
    
    public  GumballMachine3( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_cent = false;
        this.balance = 0;
    }


    public void insertCoin(int coin)
    {
      
           this.balance += coin;
           if(this.balance >= 50){
               this.has_cent = true;
           }
    }
    
    public void turnCrank(){
        if ( this.has_cent ){
            if ( this.num_gumballs > 0 ){
                this.num_gumballs-- ;
                
                if(balance < 50){
                    this.has_cent = false ;
                }
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
            }
            else{
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else if(this.balance ==0){
                System.out.println("You turned, but there is no quarter");
                
            }else if(this.balance < 50){
                System.out.println("Please insert more money");
    
            }  
    }
}
