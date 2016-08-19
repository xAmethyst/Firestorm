package mainclasses;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import lines.TPNightmare;

public class TestPrepGUI {
	
	private JFrame frame;
	
	//Intro GUI
	private JPanel intro;
	
	private JTextField fName;
	private JTextField lName;
	private JLabel askFN;
	private JLabel askLN;
	private JButton next;
	
	//Nightmare sequence
	private JPanel nightmare;
	
	private TPNightmare chapt1;
	private int i;
	
	private JPanel image;
	private JPanel gamePane;
	private JPanel dialogue;
	private JPanel text;
	private JLabel desc;
	private JLabel speaker;
	private JLabel blankA, blankB;
	private JButton cont;
	private static final int WIDTH = 1366;
	private static final int HEIGHT = 768;	
	
	public TestPrepGUI() {
		chapt1 = new TPNightmare();
		frame = new JFrame("Firestorm");
		image = new JPanel();
		cont = new JButton("Continue");
		nightmare = new JPanel();
		dialogue = new JPanel();
		image = new JPanel();
		text = new JPanel();
		desc = new JLabel();
		speaker = new JLabel();
		blankA = new JLabel();
		blankB = new JLabel();
		
		//Screen size: 1366 x 768
		frame.setSize(1000, 700);
		frame.add(nightmare);
		nightmare.setLayout(new GridLayout(2, 1));
		nightmare.add(image);
		nightmare.add(dialogue);
		//dialogue.setPreferredSize(new Dimension(1366, 256));
		dialogue.setLayout(new BorderLayout());
		dialogue.add(desc, BorderLayout.CENTER);
		dialogue.add(cont, BorderLayout.PAGE_END);
		dialogue.add(speaker, BorderLayout.PAGE_START);
		
		desc.setFont(new Font("Arial", Font.PLAIN, 24));
		desc.setHorizontalAlignment(SwingConstants.CENTER);
		desc.setText(chapt1.getLine(0));
		
		speaker.setFont(new Font("Arial", Font.ITALIC, 20));
		speaker.setText("");
		
		cont.addActionListener(new Listener());
		
		frame.setVisible(true);
		dialogue.setVisible(true);
		image.setVisible(true);
		nightmare.setVisible(true);
		
		
	}
	
	private JFrame firstDay;
	private JFrame classroom;
	private JFrame virtualA;
	private JFrame virtualB;
	private JFrame nightmareB;
	private JFrame contPrep;
	private JFrame dream;
	private JFrame test;
	
	private class Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Object x = e.getSource();
				if(x == cont) {
					if(i < chapt1.lines.size()-1) {
						i++;
						desc.setText(chapt1.getLine(i));
						System.out.println(i);
						if(i == 1||i == 2||i == 4||i == 12||i == 15||i == 17){
							speaker.setText("You");
						}
						else if(i == 9||i == 10){
							speaker.setText("Abigail:");
						}
						else{
							speaker.setText("");
						}
					}
					
				}
				
			}
			
		}
	private class ListenerB implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
		}
		
	}
	
}
