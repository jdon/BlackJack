package me.jdon.black.jack;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;




import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class Board extends JFrame {
	private static final long serialVersionUID = 5871167145961259947L;
	private JPanel contentPane;
	List<JLabel> DealerLabels = new ArrayList<JLabel>();
	
	Game ga;
	
	private int num = 1;
	private int o = 1;
	Board lel = this;
	
	public JLabel PlayerCard1Label = new JLabel("");
	public JLabel PlayerCard2Label = new JLabel("");
	public JLabel PlayerCard3Label = new JLabel("");
	public JLabel PlayerCard4Label = new JLabel("");
	public JLabel PlayerCard5Label = new JLabel("");
	public JLabel PlayerCard6Label = new JLabel("");
	public JLabel PlayerCard7Label = new JLabel("");
	public JLabel PlayerCard8Label = new JLabel("");
	
	public JLabel DealerCard1Label = new JLabel("");
	public JLabel DealerCard2Label = new JLabel("");
	public JLabel DealerCard3Label = new JLabel("");
	public JLabel DealerCard4Label = new JLabel("");
	public JLabel DealerCard5Label = new JLabel("");
	public JLabel DealerCard6Label = new JLabel("");
	
	private final JLabel DealerValueLabel = new JLabel("");
	private JLabel ValueLabel = new JLabel("");
	private JButton btnHit = new JButton("Hit");
	private final JLabel Winner = new JLabel("");
	
	public Board(Game g) {
		ga = g;
		Player player = ga.getPlayer();
		Deck deck = ga.getDeck();
		Player Dealer = ga.getDealer();
		DealerLabels.add(DealerCard3Label);
		DealerLabels.add(DealerCard4Label);
		DealerLabels.add(DealerCard5Label);
		DealerLabels.add(DealerCard6Label);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 767, 577);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(50, 205, 50));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(50, 205, 50));
		panel.setBounds(261, 360, 238, 115);
		contentPane.add(panel);
		panel.setLayout(null);
		
		PlayerCard8Label.setBounds(150, 11, 82, 96);
		panel.add(PlayerCard8Label);
		
		PlayerCard7Label.setBounds(130, 11, 72, 96);
		panel.add(PlayerCard7Label);
		
		PlayerCard6Label.setBounds(110, 11, 72, 96);
		panel.add(PlayerCard6Label);
		
		PlayerCard5Label.setBounds(90, 11, 72, 96);
		panel.add(PlayerCard5Label);
		
		PlayerCard4Label.setBounds(70, 11, 72, 96);
		panel.add(PlayerCard4Label);
		
		PlayerCard3Label.setBounds(50, 11, 72, 96);
		panel.add(PlayerCard3Label);
		
		PlayerCard2Label.setBounds(30, 11, 72, 96);
		PlayerCard2Label.setIcon(player.getHand().getPlayerCards().get(0).getImageIcon());
		panel.add(PlayerCard2Label);
		
		PlayerCard1Label.setBounds(10, 11, 72, 96);
		PlayerCard1Label.setIcon(player.getHand().getPlayerCards().get(1).getImageIcon());
		panel.add(PlayerCard1Label);
		
		ValueLabel.setBounds(344, 476, 46, 14);
		contentPane.add(ValueLabel);
		
		ValueLabel.setText(player.getHand().getValue().toString());
		btnHit.setBounds(622, 514, 55, 23);
		contentPane.add(btnHit);
		btnHit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(num == 1){
				player.getHand().getPlayerCards().add(ga.PlayerHit());
				PlayerCard3Label.setIcon(player.getHand().getPlayerCards().get(2).getImageIcon());
				num++;
				ValueLabel.setText(player.getHand().getValue().toString());
				}else if(num == 2){
					player.getHand().getPlayerCards().add(ga.PlayerHit());
					PlayerCard4Label.setIcon(player.getHand().getPlayerCards().get(3).getImageIcon());
					num++;
					ValueLabel.setText(player.getHand().getValue().toString());
					}else if(num == 3){
						player.getHand().getPlayerCards().add(ga.PlayerHit());
						PlayerCard5Label.setIcon(player.getHand().getPlayerCards().get(4).getImageIcon());
						num++;
						ValueLabel.setText(player.getHand().getValue().toString());
						}else if(num == 4){
							player.getHand().getPlayerCards().add(ga.PlayerHit());
							PlayerCard6Label.setIcon(player.getHand().getPlayerCards().get(5).getImageIcon());
							num++;
							ValueLabel.setText(player.getHand().getValue().toString());
							}else if(num == 5){
								player.getHand().getPlayerCards().add(ga.PlayerHit());
								PlayerCard7Label.setIcon(player.getHand().getPlayerCards().get(6).getImageIcon());
								num++;
								ValueLabel.setText(player.getHand().getValue().toString());
								}else if(num == 6){
									player.getHand().getPlayerCards().add(ga.PlayerHit());
									PlayerCard8Label.setIcon(player.getHand().getPlayerCards().get(7).getImageIcon());
									num++;
									ValueLabel.setText(player.getHand().getValue().toString());
									}				
			}
		});
		
		JButton btnStick = new JButton("Stick");
		btnStick.setBounds(687, 514, 64, 23);
		contentPane.add(btnStick);
		btnStick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				//deal dealer cards
						btnHit.setEnabled(false);
						DealerCard2Label.setIcon(Dealer.getHand().getPlayerCards().get(1).getImageIcon());
						getDealerValueLabel().setText(Dealer.getHand().getValue().toString());
				if (Dealer.getHand().getValue().getValue() >=17){
					//stick
					//timer.stop();
				}else{
					ga.DealerStick(lel);
					}
					/*
						Dealer.getHand().getPlayerCards().add(game.PlayerHit());
						DealerCard3Label.setIcon(Dealer.getHand().getPlayerCards().get(2).getImageIcon());
						DealerValueLabel.setText(String.valueOf(Dealer.getHand().getValue().getValue()));
						if(!(Dealer.getHand().getValue().getValue() >=17)){
							Dealer.getHand().getPlayerCards().add(game.PlayerHit());
							DealerCard4Label.setIcon(Dealer.getHand().getPlayerCards().get(3).getImageIcon());
							DealerValueLabel.setText(String.valueOf(Dealer.getHand().getValue().getValue()));
							if(!(Dealer.getHand().getValue().getValue() >=17)){
								Dealer.getHand().getPlayerCards().add(game.PlayerHit());
								DealerCard5Label.setIcon(Dealer.getHand().getPlayerCards().get(4).getImageIcon());
								DealerValueLabel.setText(String.valueOf(Dealer.getHand().getValue().getValue()));
								if(!(Dealer.getHand().getValue().getValue() >=17)){
									Dealer.getHand().getPlayerCards().add(game.PlayerHit());
									DealerCard6Label.setIcon(Dealer.getHand().getPlayerCards().get(4).getImageIcon());
									DealerValueLabel.setText(String.valueOf(Dealer.getHand().getValue().getValue()));
								}
							}
							
						}
				}
										*/
				//hit
				if(Dealer.getHand().getValue().getValue() >21){
					//dealer bust
					Winner.setText("Player wins");
					//restartGame();
				}else if(Dealer.getHand().getValue().getValue() > player.getHand().getValue().getValue()){
					// dealer has higher cards
					Winner.setText("Dealer wins");
					//restartGame();
				}else{
					Winner.setText("Player wins");
					//restartGame();
				}
			}
		});
		
		
		JPanel Dealerpanel = new JPanel();
		Dealerpanel.setBackground(new Color(50, 205, 50));
		Dealerpanel.setBounds(144, 53, 471, 121);
		contentPane.add(Dealerpanel);
		GridBagLayout gbl_Dealerpanel = new GridBagLayout();
		gbl_Dealerpanel.columnWidths = new int[]{72, 73, 0, 0, 0, 76, 0, 0, 153, 0};
		gbl_Dealerpanel.rowHeights = new int[]{99, 0};
		gbl_Dealerpanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_Dealerpanel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		Dealerpanel.setLayout(gbl_Dealerpanel);
		
		DealerCard1Label.setIcon(Dealer.getHand().getPlayerCards().get(0).getImageIcon());
		getDealerValueLabel().setText(String.valueOf(Dealer.getHand().getPlayerCards().get(0).getvalue()));
		GridBagConstraints gbc_DealerCard1Label = new GridBagConstraints();
		gbc_DealerCard1Label.fill = GridBagConstraints.BOTH;
		gbc_DealerCard1Label.insets = new Insets(0, 0, 0, 5);
		gbc_DealerCard1Label.gridx = 2;
		gbc_DealerCard1Label.gridy = 0;
		Dealerpanel.add(DealerCard1Label, gbc_DealerCard1Label);
		
		DealerCard2Label.setIcon(new ImageIcon(Board.class.getResource("/me/jdon/black/jack/img.png")));
		GridBagConstraints gbc_DealerCard2Label = new GridBagConstraints();
		gbc_DealerCard2Label.fill = GridBagConstraints.BOTH;
		gbc_DealerCard2Label.insets = new Insets(0, 0, 0, 5);
		gbc_DealerCard2Label.gridx = 3;
		gbc_DealerCard2Label.gridy = 0;
		Dealerpanel.add(DealerCard2Label, gbc_DealerCard2Label);
		
		GridBagConstraints gbc_DealerCard3Label = new GridBagConstraints();
		gbc_DealerCard3Label.fill = GridBagConstraints.BOTH;
		gbc_DealerCard3Label.insets = new Insets(0, 0, 0, 5);
		gbc_DealerCard3Label.gridx = 4;
		gbc_DealerCard3Label.gridy = 0;
		Dealerpanel.add(DealerCard3Label, gbc_DealerCard3Label);
		
		GridBagConstraints gbc_DealerCard4Label = new GridBagConstraints();
		gbc_DealerCard4Label.insets = new Insets(0, 0, 0, 5);
		gbc_DealerCard4Label.anchor = GridBagConstraints.WEST;
		gbc_DealerCard4Label.fill = GridBagConstraints.VERTICAL;
		gbc_DealerCard4Label.gridx = 5;
		gbc_DealerCard4Label.gridy = 0;
		Dealerpanel.add(DealerCard4Label, gbc_DealerCard4Label);
		
		GridBagConstraints gbc_DealerCard5Label = new GridBagConstraints();
		gbc_DealerCard5Label.insets = new Insets(0, 0, 0, 5);
		gbc_DealerCard5Label.anchor = GridBagConstraints.EAST;
		gbc_DealerCard5Label.fill = GridBagConstraints.VERTICAL;
		gbc_DealerCard5Label.gridx = 6;
		gbc_DealerCard5Label.gridy = 0;
		Dealerpanel.add(DealerCard5Label, gbc_DealerCard5Label);
		
		GridBagConstraints gbc_DealerCard6Label = new GridBagConstraints();
		gbc_DealerCard6Label.insets = new Insets(0, 0, 0, 5);
		gbc_DealerCard6Label.gridx = 7;
		gbc_DealerCard6Label.gridy = 0;
		Dealerpanel.add(DealerCard6Label, gbc_DealerCard6Label);
		getDealerValueLabel().setBounds(331, 173, 46, 14);
		
		contentPane.add(getDealerValueLabel());
		
		JButton btnNewButton = new JButton("Restart Game");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				restartGame();
			}
		});
		btnNewButton.setBounds(492, 514, 120, 23);
		contentPane.add(btnNewButton);
		Winner.setBounds(312, 257, 114, 14);
		
		contentPane.add(Winner);
	}
	public void restartGame(){
		ga.restartGame();
		/*
		num = 1;
		player.clearHand();
		Dealer.clearHand();
		deck.shuffledeck();
		
		player.getHand().addCard(game.PlayerHit());
		Dealer.getHand().addCard(game.PlayerHit());
		player.getHand().addCard(game.PlayerHit());
		Dealer.getHand().addCard(game.PlayerHit());
		
		DealerValueLabel.setText(String.valueOf(player.getHand().getPlayerCards().get(0).getvalue()));
		ValueLabel.setText(player.getHand().getValue().toString());
		
		btnHit.setEnabled(true);
		Winner.setText(null);
		
		 PlayerCard1Label.setIcon(player.getHand().getPlayerCards().get(1).getImageIcon());
		 PlayerCard2Label.setIcon(player.getHand().getPlayerCards().get(0).getImageIcon());
		 PlayerCard3Label.setIcon(null);
		 PlayerCard4Label.setIcon(null);
		 PlayerCard5Label.setIcon(null);
		 PlayerCard6Label.setIcon(null);
		 PlayerCard7Label.setIcon(null);
		 PlayerCard8Label.setIcon(null);
		 
		 DealerCard1Label.setIcon(Dealer.getHand().getPlayerCards().get(0).getImageIcon());
		 DealerCard2Label.setIcon(new ImageIcon(Board.class.getResource("/me/jdon/black/jack/img.png")));
		 DealerCard3Label.setIcon(null);
		 DealerCard4Label.setIcon(null);
		 DealerCard5Label.setIcon(null);
		 DealerCard6Label.setIcon(null);
		 	*/
	}
	public JLabel getDealerValueLabel() {
		return DealerValueLabel;
	}
}
