package me.jdon.black.jack;

public class Value {
	
	private Hand hand;
	
	public Value(Hand h){
		this.hand = h;
	}
	
	
	public int getValue(){
		if(this.value() >21 && this.aceValue() <=21){
			return this.aceValue();
		}else{
			return value();
		}
	}
	
	private int value(){
		int total = 0;
		for(Card c:hand.getPlayerCards()){
			int value = c.getvalue();
			total = total+value;
		}
		return total;
	}
	
	private int aceValue(){
		int total = 0;
		for(Card c:hand.getPlayerCards()){
			int value = c.getvalue();
			if(value ==11){
				total++;
			}else{
				total = total+value;
			}
		}
		return total;
	}
	
	@Override
    public String toString(){
		if(this.value() == this.aceValue()){
			return String.valueOf(this.value());
		}else{
			if(this.value() >21){
				return String.valueOf(this.aceValue());
			}
			return String.valueOf(this.value())+"/"+String.valueOf(this.aceValue());
		}
	}

}
