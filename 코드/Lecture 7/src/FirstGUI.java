import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.*;

public class FirstGUI {

	public static void main(String[] args) {
		JFrame window = new JFrame();
		//settings for the frame
		window.setSize(300, 300);
		window.setTitle("First GUI");
		//EXIT_ON_CLOSE = Static value
		//close with clicking on the X button
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//create a button
		JButton button1 = new JButton();
		button1.setText("Back");
		button1.setBackground(Color.CYAN);
		
		JButton button2 = new JButton();
		button2.setText("Next");
		button2.setBackground(Color.RED);
		
		JButton button3 = new JButton("Explore");
		JButton button4 = new JButton("Cancel");
		JButton button5 = new JButton("Send");
		
		//set Layout for the components (buttons)
		//C++ and others usually use absolute positioning using x and y
		//Java usually prefers layout managers (containers) where objects decide using general rules
		FlowLayout layout = new FlowLayout();
		//GridLayout layout = new GridLayout(2, 1);
		//BorderLayout layout = new BorderLayout();
			//for borderlayout : window.add(button1, BorderLayout.WEST);
			// EAST, WEST, CENTER, NORTH, SOUTH
		
		
		window.setLayout(layout);
		//can simplify as window.setLayout(new BorderLayout());
		
		window.add(button1);
		window.add(button2);
		window.add(button3);
		window.add(button4);
		window.add(button5);
		//if setLayout is added after the adding of buttions, must use:
		// window.validate();
		
		//add actionListeners to buttons
		changeColor listener = new changeColor();
		anotherAction listener2 = new anotherAction();
		listener.setControl(button3);
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		button3.addActionListener(listener2);
		button4.addActionListener(new anotherAction());
		//if changeColor class was private
		
		window.setVisible(true);
	}

}

//action listener to give a button a certain command once it receives action
class changeColor implements ActionListener{
	JButton controlledButton;
	
	void setControl(JButton object) {
		//set the button object as the controlledButton object
		controlledButton = object;
		
	}
	
	void changeColor() {
		//change color of controlledButton object to yellow
		controlledButton.setBackground(Color.YELLOW);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//code to do when clicked
		//change color of a button to yellow
		changeColor();
		//print "Clicked" in the terminal
		System.out.println("Clicked");
	}
	
}


class anotherAction implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		//code to do when clicked
		//print "Knock!" in the terminal
		System.out.println("Knock!");
	}
	
}
