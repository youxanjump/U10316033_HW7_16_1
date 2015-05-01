import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pickFourCards{
	
	public static void main(String args[]){
		dealCard frame = new dealCard();
		frame.setTitle("Pick Four Cards");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,200);
		frame.setVisible(true);
	}

}

class dealCard extends JFrame{
	private JButton jbtRefresh = new JButton("Refresh");
	private ImageIcon poker0 = new ImageIcon("image/card/1.png");
	private ImageIcon poker1 = new ImageIcon("image/card/2.png");
	private ImageIcon poker2 = new ImageIcon("image/card/3.png");
	private ImageIcon poker3 = new ImageIcon("image/card/4.png");
	private ImageIcon poker4 = new ImageIcon("image/card/5.png");
	private ImageIcon poker5 = new ImageIcon("image/card/6.png");
	private ImageIcon poker6 = new ImageIcon("image/card/7.png");
	private ImageIcon poker7 = new ImageIcon("image/card/8.png");
	private ImageIcon poker8 = new ImageIcon("image/card/9.png");
	private ImageIcon poker9 = new ImageIcon("image/card/10.png");
	private ImageIcon poker10 = new ImageIcon("image/card/11.png");
	private ImageIcon poker11 = new ImageIcon("image/card/12.png");
	private ImageIcon poker12 = new ImageIcon("image/card/13.png");
	private ImageIcon poker13 = new ImageIcon("image/card/14.png");
	private ImageIcon poker14 = new ImageIcon("image/card/15.png");
	private ImageIcon poker15 = new ImageIcon("image/card/16.png");
	private ImageIcon poker16 = new ImageIcon("image/card/17.png");
	private ImageIcon poker17 = new ImageIcon("image/card/18.png");
	private ImageIcon poker18 = new ImageIcon("image/card/19.png");
	private ImageIcon poker19 = new ImageIcon("image/card/20.png");
	private ImageIcon poker20 = new ImageIcon("image/card/21.png");
	private ImageIcon poker21 = new ImageIcon("image/card/22.png");
	private ImageIcon poker22 = new ImageIcon("image/card/23.png");
	private ImageIcon poker23 = new ImageIcon("image/card/24.png");
	private ImageIcon poker24 = new ImageIcon("image/card/25.png");
	private ImageIcon poker25 = new ImageIcon("image/card/26.png");
	private ImageIcon poker26 = new ImageIcon("image/card/27.png");
	private ImageIcon poker27 = new ImageIcon("image/card/28.png");
	private ImageIcon poker28 = new ImageIcon("image/card/29.png");
	private ImageIcon poker29 = new ImageIcon("image/card/30.png");
	private ImageIcon poker30 = new ImageIcon("image/card/31.png");
	private ImageIcon poker31 = new ImageIcon("image/card/32.png");
	private ImageIcon poker32 = new ImageIcon("image/card/33.png");
	private ImageIcon poker33 = new ImageIcon("image/card/34.png");
	private ImageIcon poker34 = new ImageIcon("image/card/35.png");
	private ImageIcon poker35 = new ImageIcon("image/card/36.png");
	private ImageIcon poker36 = new ImageIcon("image/card/37.png");
	private ImageIcon poker37 = new ImageIcon("image/card/38.png");
	private ImageIcon poker38 = new ImageIcon("image/card/39.png");
	private ImageIcon poker39 = new ImageIcon("image/card/40.png");
	private ImageIcon poker40 = new ImageIcon("image/card/41.png");
	private ImageIcon poker41 = new ImageIcon("image/card/42.png");
	private ImageIcon poker42 = new ImageIcon("image/card/43.png");
	private ImageIcon poker43 = new ImageIcon("image/card/44.png");
	private ImageIcon poker44 = new ImageIcon("image/card/45.png");
	private ImageIcon poker45 = new ImageIcon("image/card/46.png");
	private ImageIcon poker46 = new ImageIcon("image/card/47.png");
	private ImageIcon poker47 = new ImageIcon("image/card/48.png");
	private ImageIcon poker48 = new ImageIcon("image/card/49.png");
	private ImageIcon poker49 = new ImageIcon("image/card/50.png");
	private ImageIcon poker50 = new ImageIcon("image/card/51.png");
	private ImageIcon poker51 = new ImageIcon("image/card/52.png");
	
	public dealCard(){
		JPanel panel = new JPanel();
		panel.add(jbtRefresh);
		GridLayout grid = new GridLayout(1,4,0,0);

		
		this.add(panel,BorderLayout.SOUTH);
		this.add(grid,BorderLayout.CENTER);
	}
}
