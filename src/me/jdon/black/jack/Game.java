package me.jdon.black.jack;

import java.awt.Frame;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JLabel;

public class Game {
	
	private Deck deck = new Deck();
	private Player player = new Player(1000, new Hand(),"Player 1");
	private Player Dealer = new Player(1000, new Hand(),"Dealer");

	public Game(){
		Dealer.getHand().addCard(deck.dealacard());
		player.getHand().addCard(deck.dealacard());
		Dealer.getHand().addCard(deck.dealacard());
		player.getHand().addCard(deck.dealacard());
	}
	
	public Card PlayerHit(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return deck.dealacard();
	}
	
	public void DealerStick(Board lel){
		int o = 0;
		for(JLabel j: lel.DealerLabels){
			if(!(Dealer.getHand().getValue().getValue() >=17)){
				    	  o++;
		    	    	 Dealer.getHand().getPlayerCards().add(PlayerHit());
						j.setIcon(Dealer.getHand().getPlayerCards().get(o).getImageIcon());
						lel.getDealerValueLabel().setText(String.valueOf(Dealer.getHand().getValue().getValue()));
					if(Integer.valueOf(lel.getDealerValueLabel().getText()) == 17){
						break;
					}
			}
	}
	}
	
	public void restartGame(){
		deck.shuffledeck();
		Frame f = new Board(this);
		f.setVisible(true);
	}
	
	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Player getDealer() {
		return Dealer;
	}

	public void setDealer(Player dealer) {
		Dealer = dealer;
	}
	
	

}
