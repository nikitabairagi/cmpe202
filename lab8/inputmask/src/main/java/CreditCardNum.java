/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum  implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String number = "" ;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( number.equals("") )
			return "[4444 4444 4444 4444]" + "  " ;
		else
			return "[" + number + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if ( cnt <= 16 ){
			if(ch.equalsIgnoreCase("X") || ch.equals("Delete")){
				backspace(cnt);
			}else{
				number += ch ;
			}
		}
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

	public void backspace(int cnt){
		if (number != null && number.length() > 0 && (cnt == 5 || cnt == 9 || cnt == 13)) {
			number = number.substring(0, number.length() - 2);

		}else if(number != null && number.length() > 0){
			number = number.substring(0, number.length() - 1);
		}
	}

}