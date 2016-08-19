package testGUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import lines.TPNightmare;

public class MechanicsGUI {
	
	private JFrame frame;
	private JButton cont;
	private JPanel text;
	private JPanel image;
	private JLabel labelA;
	private JLabel labelB;
	private JLabel labelC;
	ArrayList<JLabel> list;
	
	public MechanicsGUI() {
		frame = new JFrame("Test Mechanics");
		frame.setSize(800, 600);
		cont = new JButton("Continue");
		text = new JPanel();
		image = new JPanel();
		list = new ArrayList<JLabel>();
		/*labelA = new JLabel(TPNightmare.de1);
		labelB = new JLabel(TPNightmare.di1);
		labelC = new JLabel(TPNightmare.de2);*/
		list.add(labelA);
		list.add(labelB);
		list.add(labelB);
		
		frame.setLayout(new GridLayout(2, 1));
		frame.add(image);
		frame.add(text);
		text.setLayout(new GridLayout(1, 2));
		text.add(list.get(0));
		text.add(cont);
		
		cont.addActionListener(new Listener());
		
		frame.setVisible(true);
		text.setVisible(true);
		image.setVisible(true);
		
		
	}
	
	private class Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Object x = e.getSource();
			int count = 0;
			if(x == cont) {
				//labelA.setText(TPNightmare.di1);
				/*for(int i = 0; i < list.size(); i++) {
					text.remove(list.get(i));
					text.add(list.get(i+1));
					i++;
				}*/
				
			}
			
		}
		
	}

}
