public class SpaceDecorator implements IDisplayComponent,IKeyEventHandler {

    CreditCardNum num;

    public SpaceDecorator(CreditCardNum num){
       this.num = num;
    }

    public String display(){
        return num.display();
    }

    public void setNext(IKeyEventHandler next){
        num.setNext(next);
    }

    public void key(String ch , int cnt){
       if(cnt == 4 || cnt == 8 || cnt == 12){
           ch = ch + " ";
           num.key(ch, cnt);
       }else{
           num.key(ch, cnt);
       }

    }

    public void addSubComponent(IDisplayComponent c){
        //do nothing
    }
}

