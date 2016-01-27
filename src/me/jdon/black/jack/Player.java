package me.jdon.black.jack;

public class Player{
	
	private int money;
	private Hand hand;
	
	private String name = "null";

	public Player(int money,Hand hand,String name) {
		this.setMoney(money);
		this.sethand(hand);
		this.setName(name);
	}
	
	public void sethand(Hand h){
		this.hand = h;
	}
	
	public Hand getHand(){
		return hand;
		
	}
	
	public void clearHand(){
		this.hand = new Hand();
	}
	

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
