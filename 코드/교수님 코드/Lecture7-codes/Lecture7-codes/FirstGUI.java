import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FirstGUI {

	public static void main(String[] args) {
		JFrame window = new JFrame();
		// settings for the frame
		window.setSize(300, 300);
		window.setTitle("First GUI");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton button1 = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton("Explore");
		JButton button4 = new JButton("Cancel");
		JButton button5 = new JButton("Send");
		// settings for button object
		button1.setText("Back");
		button1.setBackground(Color.CYAN);

		button2.setText("Next");
		button2.setBackground(Color.RED);
		
		//GridLayout layout = new GridLayout(3,2);
		//FlowLayout layout = new FlowLayout();
		
		window.setLayout(new BorderLayout());

		window.add(button1, BorderLayout.EAST);
		window.add(button2, BorderLayout.WEST);
		window.add(button3, BorderLayout.CENTER);
		window.add(button4, BorderLayout.NORTH);
		window.add(button5, BorderLayout.SOUTH);

		// add actionListeners to buttons
		// FirstGUI.changeColor listener = new FirstGUI().new changeColor();
		 
		button1.addActionListener(new FirstGUI().new changeColor());
		button2.addActionListener(new FirstGUI().new anotherAction());
		button3.addActionListener(new FirstGUI().new changeColor());
		button4.addActionListener(new FirstGUI().new anotherAction());
		button5.addActionListener(new FirstGUI().new anotherAction());
		window.setVisible(true);
	}

	private class changeColor implements ActionListener {
		

		@Override
		public void actionPerformed(ActionEvent e) {
			// code to do when you click a button
			// change();
			System.out.println("Red Color");

		}

	}

	private class anotherAction implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// code to do when you click a button
			// change();
			System.out.println("KNock!!");

		}

	}

}