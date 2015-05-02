import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pickFourCards extends JFrame{

	int[] deck = new int[52];
	ImageIcon[] poker = new ImageIcon[52];	
	private JLabel card1;
	private JLabel card2;
	private JLabel card3;
	private JLabel card4;
	
	private JButton jbtRefresh = new JButton("Refresh");
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	
	public pickFourCards(){
		
		for(int i = 0 ; i < poker.length ; i ++){
			poker[i] = new ImageIcon((getClass().getResource("image/card/" + (i+1) +".png")));
		}
		
		
		panel.add(jbtRefresh);
		
		panel1.setLayout(new GridLayout(1,4,1,1));
		
		for(int i = 0; i < deck.length; i++)
			deck[i] = i;
			
				  
		for(int i = 0; i < deck.length; i++){
			int index = (int)(Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}

		card1 = new JLabel(poker[deck[0]]);
		card2 = new JLabel(poker[deck[1]]);
		card3 = new JLabel(poker[deck[2]]);
		card4 = new JLabel(poker[deck[3]]);
		
		panel1.add(card1);
		panel1.add(card2);
		panel1.add(card3);
		panel1.add(card4);
		
		this.add(panel,BorderLayout.SOUTH);
		this.add(panel1,BorderLayout.CENTER);
		
		jbtRefresh.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			
			panel1.repaint();
			for(int i = 0; i < deck.length; i++)
				deck[i] = i;
			
				  
			for(int i = 0; i < deck.length; i++){
				int index = (int)(Math.random() * deck.length);
				int temp = deck[i];
				deck[i] = deck[index];
				deck[index] = temp;
			}	
			
			card1.setIcon(poker[deck[0]]);
			card2.setIcon(poker[deck[1]]);
			card3.setIcon(poker[deck[2]]);
			card4.setIcon(poker[deck[3]]);

			}
		});
		
	}
	
	
	
	public static void main(String args[]){
		JFrame frame = new pickFourCards();
		frame.setTitle("Pick Four Cards");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,200);
		frame.setVisible(true);
	}

}

