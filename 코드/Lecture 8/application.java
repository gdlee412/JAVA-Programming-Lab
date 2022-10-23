import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;

public class application extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton ResetButton;
	private JPanel panel;
	private JLabel BlueScoreLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton RedScoreButton;
	private JButton BlueScoreButton;
	private int redCounter = 0;
	private int blueCounter = 0;
	private JLabel RedScoreLabel;

	/**
	 * Create the frame.
	 */
	public application() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 232);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		ResetButton = new JButton("Reset Score");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(ResetButton, BorderLayout.SOUTH);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 2, 0, 0));
		
		lblNewLabel_1 = new JLabel("Red Team");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Blue Team");
		lblNewLabel_2.setForeground(new Color(0, 0, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_2);
		
		RedScoreLabel = new JLabel("0");
		RedScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(RedScoreLabel);
		
		BlueScoreLabel = new JLabel("0");
		BlueScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(BlueScoreLabel);
		
		RedScoreButton = new JButton("Red Score");
		panel.add(RedScoreButton);
		
		BlueScoreButton = new JButton("Blue Score");
		panel.add(BlueScoreButton);
		RedScoreButton.addActionListener(this);
		BlueScoreButton.addActionListener(this);
		ResetButton.addActionListener(this);
	}
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					application frame = new application();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == RedScoreButton) {
			redCounter++;
			RedScoreLabel.setText(redCounter + "");
		}
		else if(e.getSource() == BlueScoreButton) {
			blueCounter++;
			BlueScoreLabel.setText(blueCounter + "");
		}
		else if(e.getSource() == ResetButton) {
			BlueScoreLabel.setText("0");
			RedScoreLabel.setText("0");
			blueCounter = 0;
			redCounter = 0;
		}
		
	}

}
