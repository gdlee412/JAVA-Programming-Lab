import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class converter extends JFrame {

	private JPanel contentPane;
	private JLabel lblDisplay;
	private JTextField textFieldInput;
	private JButton btnCalculate;
	private JLabel lblOutput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					converter frame = new converter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public converter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 149);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));

		lblDisplay = new JLabel("Fahrenheit");
		lblDisplay.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblDisplay);

		textFieldInput = new JTextField();
		contentPane.add(textFieldInput);
		textFieldInput.setColumns(10);

		btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double userFahrenheit = Double.parseDouble(textFieldInput.getText());
				if(userFahrenheit<-459.67) {
					
					throw new OverLimit();
				}
				double CelsiusDegree = (userFahrenheit - 32) * 5 / 9;
				lblOutput.setText(CelsiusDegree + " C");
				}catch(NumberFormatException ex) {
					
					JOptionPane.showMessageDialog(null,"Please insert numbers only","Error message", 
							JOptionPane.ERROR_MESSAGE);
				} catch (OverLimit e1) {
					JOptionPane.showMessageDialog(null,"Please insert numbers bigger than the absolute zero K","Error message", 
							JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
		contentPane.add(btnCalculate);

		lblOutput = new JLabel("");
		contentPane.add(lblOutput);
	}

}
