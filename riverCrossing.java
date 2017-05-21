import javax.swing.*;
import java.awt.BorderLayout;
import javax.swing.border.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
 
 public class riverCrossing
 {
 
  
 

 
 public void createGame(){
	 
	 //JFrame.setDefaultLookAndFeelDecorated(true);
	JFrame window = new JFrame("River Crossing Game"); 
	JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0,0));
    GridLayout layout = new GridLayout(13,9);
	panel.setLayout(layout);
    JButton buttons[];
	
	ImageIcon bank1 = new ImageIcon("bank1.jpg");
	ImageIcon bank2 = new ImageIcon("bank2.jpg");
	ImageIcon water1 = new ImageIcon("water1.jpg");
	ImageIcon water2 = new ImageIcon("water2.jpg");
	ImageIcon stump1 = new ImageIcon("stump1.jpg");
	ImageIcon stump2 = new ImageIcon("stump2.jpg");
	ImageIcon stump3 = new ImageIcon("stump3.jpg");
	ImageIcon stumpMan1 = new ImageIcon("stump1_man.jpg");
	ImageIcon stumpMan2 = new ImageIcon("stump2_man.jpg");
	ImageIcon stumpMan3 = new ImageIcon("stump3_man.jpg");
	
	
	
	
	
	
	
	
	
	 
	buttons = new JButton [117];
	for (int j =0; j<117; j++){
		buttons[j] = new JButton(String.valueOf(j));
	
	 
	 if (j<9) {
		 buttons[j] = new JButton(bank2);
		 
		 
	 }
	 
	 if (j>107) {
		 buttons[j] = new JButton(bank1);
		 
		 
	 }

	if (j<108&&j>8) {
		buttons[j] = new JButton(water1);
		 
		 
	 }	 
	 if (j==4) {
		buttons[j] = new JButton(stump3);
		
		buttons[4].addActionListener(new ActionListener(){	
			public void actionPerformed(ActionEvent e){
				
				
				
			}
		});
		 
		 
	 }	
	 
	 if (j==31) {
		buttons[j] = new JButton(stump1);
		 
		 
	 }	
	 if (j==58) {
		buttons[j] = new JButton(stump1);
		 
		 
	 }	
	  if (j==85) {
		buttons[j] = new JButton(stump1);
		 
		 
	 
		 
		 
	 }	

	  if (j==112) {
		buttons[j] = new JButton(stumpMan2);
		 
		 
	 }
   
   
   
   
		

	 panel.add(buttons[j]);
	 
 }
	
	window.setSize(320, 500);
  
    window.setVisible(true);
	window.add(panel,BorderLayout.CENTER);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 
 
 
 }
 

 }