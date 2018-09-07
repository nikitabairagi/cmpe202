
/**
 * Write a description of class GumballMachine2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GumballMachine2 
{

    private int num_gumballs;
    private boolean has_cent;
    private int num_quarter;
    
    public  GumballMachine2( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_cent = false;
        this.num_quarter = 0;
    }


    public void insertCoin(int coin)
    {
       if(coin == 25){
           this.num_quarter++;
           if(this.num_quarter == 2){
               this.has_cent = true;
           }
       } else{
           System.out.println("Not valid coin.Insert a quarter");
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
        else if(num_quarter ==0){
                System.out.println("You turned, but there is no quarter");
                
            }else if(num_quarter == 1){
                System.out.println("Insert one more quarter");
    
            }else{
                System.out.println( "Please insert a quarter" ) ;
            }    
    }
}
