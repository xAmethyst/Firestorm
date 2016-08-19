package testGUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class InfoGUI {
	
	private int count;
	private JFrame frame;
	private JPanel contain;
	private JPanel containB;
	private JPanel content;
	private JPanel image;
	private JPanel ask;
	private JPanel answer;
	private JTextField fName;
	private JTextField lName;
	private JLabel askFN;
	private JLabel askLN;
	private JLabel talk;
	private JButton next;
	
	public InfoGUI(){
		frame = new JFrame();
		contain = new JPanel();
		containB = new JPanel();
		content = new JPanel();
		ask = new JPanel();
		answer = new JPanel();
		image = new JPanel();
		fName = new JTextField(15);
		lName = new JTextField(15);
		askFN = new JLabel("<html><p>What is your first name?</p></html>");
		askLN = new JLabel("<html><p>What is your last name?</p></html>");
		talk = new JLabel("<html><p>Before you join the world, tell us a little about yourself.</p></html>");
		next = new JButton("Next");
		count = 0;
		
		frame.setSize(800, 600);
		frame.add(contain);
		contain.setLayout(new GridLayout(2,1));
		contain.add(image);
		contain.add(content);
		content.setLayout(new BorderLayout());
		content.add(talk, BorderLayout.PAGE_START);
		content.add(ask, BorderLayout.LINE_START);
		content.add(answer, BorderLayout.CENTER);
		content.add(next, BorderLayout.PAGE_END);
		ask.setLayout(new GridLayout(2,1));
		answer.setLayout(new GridLayout(2,1));
		
		ask.add(askFN);
		ask.add(askLN);
		answer.add(fName);
		answer.add(lName);
		next.addActionListener(new Listener());
		
		frame.setVisible(true);
		contain.setVisible(true);
		content.setVisible(true);
		ask.setVisible(true);
		answer.setVisible(true);
		
		
	}
	
	private class Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Object x = e.getSource();
			if(x == next) {
				if(count == 0){
					count++;
					talk.setText("<html><p>Welcome, "+fName.getText()+" "+lName.getText()+
							", to Firestorm.");
				}
				else {
					contain.setVisible(false);
					containB.setVisible(true);
				}
				
			}
			
		}
		
	}
}

