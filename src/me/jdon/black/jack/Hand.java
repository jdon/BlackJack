package me.jdon.black.jack;

import java.util.ArrayList;
import java.util.List;

public class Hand{
	
	private List<Card> PlayerCards = new ArrayList<Card>();

	
	public Hand(){

	}
	
	public Value getValue(){
		Value v = new Value(this);
		return v;
	}
	
	public List<Card> getPlayerCards() {
		return PlayerCards;
	}
	
	public void addCard(Card c){
		PlayerCards.add(c);
	}

	public void setPlayerCards(List<Card> playerCards) {
		PlayerCards = playerCards;
	}
}
