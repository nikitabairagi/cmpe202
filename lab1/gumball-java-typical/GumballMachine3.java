
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
    private int total_money;
    
    public  GumballMachine3( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_cent = false;
        this.total_money = 0;
    }


    public void insertCoin(int coin)
    {
      
           this.total_money += coin;
           if(this.total_money >= 50){
               this.has_cent = true;
           }
    }
    
    public void turnCrank(){
        if ( this.has_cent ){
            if ( this.num_gumballs > 0 ){
                this.num_gumballs-- ;
                this.has_cent = false ;
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
            }
            else{
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else if(this.total_money ==0){
                System.out.println("You turned, but there is no quarter");
                
            }else if(this.total_money < 50){
                System.out.println("Please insert more money");
    
            }  
    }
}
