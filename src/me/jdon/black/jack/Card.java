package me.jdon.black.jack;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Card{
	
	private String suit;
	private String rank;
	
	public Card(String suit,String rank){
		this.suit = suit;
		this.rank = rank;
	}
	
	public void setsuit(String suit){
		this.suit = suit;
	}
	
	public void setrank(String rank){
		this.rank = rank;
	}
	
	public String getsuit(){
		return suit;
	}
	
	public String getrank(){
		return rank;
	}
	
	public int getvalue(){
		if(Integer.valueOf(rank) >= 10 && Integer.valueOf(rank)<=12){
			return 10;
		}else if(Integer.valueOf(rank) ==13){
			return 11;
		}else{
			return Integer.valueOf(rank)+1;
		}
	}
	
	public Icon getImageIcon(){
		return new ImageIcon(Board.class.getResource("/me/jdon/black/jack/images/"+rank+suit+".png"));
	}
}
