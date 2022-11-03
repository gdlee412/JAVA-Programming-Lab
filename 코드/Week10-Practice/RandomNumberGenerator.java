import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class RandomNumberGenerator extends JFrame {

	private JPanel contentPane;
	private JPanel pnInput;
	private JLabel InputLabel;
	private JTextField textField;
	private JButton btnRun;
	private JButton btnStop;
	private JPanel pnStatus;
	private JProgressBar progressBar;
	private JLabel lblStatus;
	private JScrollPane pnList;
	private JTextArea txtArea;
	private Thread thread;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RandomNumberGenerator frame = new RandomNumberGenerator();
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
	public RandomNumberGenerator() {
		setTitle("Random Number Generator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		pnInput = new JPanel();
		contentPane.add(pnInput, BorderLayout.NORTH);
		pnInput.setLayout(new GridLayout(0, 4, 0, 0));

		InputLabel = new JLabel("Input a number");
		pnInput.add(InputLabel);

		textField = new JTextField();
		pnInput.add(textField);
		textField.setColumns(10);

		btnRun = new JButton("Run");
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thread = new Thread(new slowTask());
				thread.start();
			}
		});
		pnInput.add(btnRun);

		btnStop = new JButton("Stop");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thread.stop();
				btnRun.setEnabled(true);
				btnStop.setEnabled(false);
			}
		});
		btnStop.setEnabled(false);
		pnInput.add(btnStop);

		txtArea = new JTextArea();
		txtArea.setEditable(false);
		pnList = new JScrollPane(txtArea);
		contentPane.add(pnList, BorderLayout.CENTER);

		pnStatus = new JPanel();
		contentPane.add(pnStatus, BorderLayout.SOUTH);
		pnStatus.setLayout(new GridLayout(0, 2, 0, 0));

		progressBar = new JProgressBar();
		pnStatus.add(progressBar);

		lblStatus = new JLabel("");
		pnStatus.add(lblStatus);

	}

	class slowTask implements Runnable{
		@Override
		public void run() {
			txtArea.setText("");
			lblStatus.setText("");
			btnStop.setEnabled(true);
			btnRun.setEnabled(false);
			int userNumber = Integer.parseInt(textField.getText());
			Random randomObject = new Random();
			for (int i = 1; i <= userNumber; i++) {
				txtArea.append(i + ". Random number = " + randomObject.nextInt() + "\n");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				progressBar.setValue((i) * 100 / userNumber);
			}
			lblStatus.setText("Finished " + userNumber + " tasks.");
			btnStop.setEnabled(false);
			btnRun.setEnabled(true);
		}
	}
}
