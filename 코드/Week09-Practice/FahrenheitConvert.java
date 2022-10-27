import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;

public class FahrenheitConvert extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel FahrenheitLabel;
	private JButton CalculateButton;
	private JLabel ConvertedCelsiusLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FahrenheitConvert frame = new FahrenheitConvert();
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
	public FahrenheitConvert() {
		setTitle("Fahrenheit Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 125);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 0, 0));

		FahrenheitLabel = new JLabel("Fahrenheit");
		FahrenheitLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		FahrenheitLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(FahrenheitLabel);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(textField);
		textField.setColumns(10);

		CalculateButton = new JButton("Calculate");
		CalculateButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(CalculateButton);

		ConvertedCelsiusLabel = new JLabel("");
		ConvertedCelsiusLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		ConvertedCelsiusLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(ConvertedCelsiusLabel);

		CalculateButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == CalculateButton) {
			try {
				double fahrenheit = Double.parseDouble(textField.getText());
				if(fahrenheit < -459.67)
				{
					throw new OverLimitException();
				}
				double celsius = (fahrenheit - 32) * 5 / 9;
				ConvertedCelsiusLabel.setText(String.format("%.2f", celsius));
			} catch (NumberFormatException l) {
				JOptionPane.showMessageDialog(null, "Error! Please input numbers only!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			} catch (OverLimitException o) {
				JOptionPane.showMessageDialog(null, "Error! Enter higher values only!", "Error Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}

	}

}