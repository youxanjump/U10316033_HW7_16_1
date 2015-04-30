# U10316033_HW7_16_1
pick four cards

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pickFourCards extends JFrame{
	private JButton jbtRefresh = new JButton("Refresh");
	
	public pickFourCards(){
		JPanel panel = new JPanel();
		panel.add(jbtRefresh);
		
		this.add(panel,BorderLayout.SOUTH);
	
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
