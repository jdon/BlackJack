package me.jdon.black.jack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
	
	private int numDealt = 0;
	private List<Card> deck = new ArrayList<Card>();
	String[] suits = {"S", "H", "D", "C"};
    String[] ranks = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
	
	public Deck(){
		//generate deck of cards
		Boolean add = true;
		int i = 0;
		while(add){
		for(String suit:suits){
			for(String rank:ranks){
				Card c = new Card(suit, rank);
				deck.add(c);
			}
		}
		i++;
		if(i ==4){
			add = false;
		}
		}
		shuffledeck();
	}
	
	public Card dealacard(){
		numDealt++;
		return deck.get(numDealt-1);
	}
	
	public void shuffledeck() {
		for(int s = 0;s<=deck.size();s++){
	    int n = deck.size();
	    Random random = new Random();
	    random.nextInt();
	    for (int i = 0; i < n; i++) {
	      int change = i + random.nextInt(n - i);
	      swap(i, change);
	    }
		}
		numDealt = 0;
	  }
	
	private void swap(int i, int change){
		Card or = deck.get(i);
		Card cha = deck.get(change);
		deck.set(i, cha);
		deck.set(change, or);
	}
	
	public void printdeck(){
		for(Card c:deck){
			System.out.println(c.getrank()+" of "+c.getsuit());
		}
	}
}
