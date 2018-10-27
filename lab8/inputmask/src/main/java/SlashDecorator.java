public class SlashDecorator implements IDisplayComponent, IKeyEventHandler {

    CreditCardExp exp;

    public SlashDecorator(CreditCardExp exp){
       this.exp = exp;
    }

    public String display(){
      return exp.display();
    }

    public void setNext(IKeyEventHandler next){
        exp.setNext(next);
    }

    public void key(String ch , int cnt){
        if(cnt == 18){
            ch =  ch +"/";
            exp.key(ch,cnt);

        }else{
            exp.key(ch, cnt);
        }
    }

    public void addSubComponent(IDisplayComponent c){
        //do nothing;
    }

}
