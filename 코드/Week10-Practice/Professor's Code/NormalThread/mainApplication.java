package practice5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.Random;
import java.awt.event.ActionEvent;

public class mainApplication extends JFrame {

	private JPanel contentPane;
	private JPanel pnInput;
	private JPanel pnList;
	private JPanel pnStatus;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JButton btnRun;
	private JButton btnCancel;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JProgressBar progressBar;
	private JLabel lblStatus;
	private Thread thread;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainApplication frame = new mainApplication();
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
	public mainApplication() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		pnInput = new JPanel();
		contentPane.add(pnInput, BorderLayout.NORTH);
		pnInput.setLayout(new GridLayout(1, 4, 2, 5));

		lblNewLabel = new JLabel("Input a number");
		pnInput.add(lblNewLabel);

		textField = new JTextField();
		pnInput.add(textField);
		textField.setColumns(10);

		btnRun = new JButton("Run");
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				taskToDo longTask = new taskToDo();
				thread = new Thread(longTask);
				thread.start();

			}
		});

		pnInput.add(btnRun);

		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thread.stop();
				btnRun.setEnabled(true);
				btnCancel.setEnabled(false);

			}
		});
		btnCancel.setEnabled(false);
		pnInput.add(btnCancel);

		pnList = new JPanel();
		contentPane.add(pnList, BorderLayout.CENTER);
		pnList.setLayout(new BorderLayout(0, 0));
		textArea = new JTextArea();
		scrollPane = new JScrollPane(textArea);
		pnList.add(scrollPane);

		// pnList.add(textArea, BorderLayout.NORTH);

		pnStatus = new JPanel();
		contentPane.add(pnStatus, BorderLayout.SOUTH);
		pnStatus.setLayout(new GridLayout(1, 2, 0, 0));

		progressBar = new JProgressBar();
		pnStatus.add(progressBar);

		lblStatus = new JLabel("...");
		pnStatus.add(lblStatus);
	}

	class taskToDo implements Runnable {

		@Override
		public void run() {
			btnRun.setEnabled(false);
			btnCancel.setEnabled(true);
			lblStatus.setText("Running ...");
			textArea.setText("");
			progressBar.setValue(0);
			int number = Integer.parseInt(textField.getText());
			for (int i = 0; i < number; i++) {
				Random random = new Random();
				textArea.append(random.nextInt() + "\n");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				progressBar.setValue((i + 1) * 100 / number);

			}
			btnRun.setEnabled(true);
			btnCancel.setEnabled(false);
			lblStatus.setText("Finished");
		}

	}

}
