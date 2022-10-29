import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIExceptions extends JFrame {
	private int[] array = new int[10];
	private int index = 0;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField InsertTextField;
	private JLabel ArrayDisplayLabel;
	private JPanel panel;
	private JLabel lblNewLabel_1;
	private JTextField IndexTextField;
	private JLabel lblNewLabel_2;
	private JTextField ValueTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIExceptions frame = new GUIExceptions();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void display() {
		String contents = "";
		for (int i = 0; i < index; i++) {
			contents += " " + array[i] + " ";
		}
		contents = contents + "]";
		ArrayDisplayLabel.setText("a[" + contents);
	}

	/**
	 * Create the frame.
	 */
	public GUIExceptions() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 134);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 35, 45, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 13, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		lblNewLabel = new JLabel("Insert Number");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 6;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);

		InsertTextField = new JTextField();
		InsertTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String value = InsertTextField.getText();
					for (int i = 0; i < index; i++) {
						if (array[i] == Integer.parseInt(value)) {
							throw new GUIExceptionDuplicateValue("Duplicate Value");
						}
					}
					array[index] = Integer.parseInt(value);
					index++;
					InsertTextField.setText("");
					display();
				} catch (NumberFormatException error) {
					JOptionPane.showMessageDialog(null, "Please enter only integer values.");
				} catch (ArrayIndexOutOfBoundsException error) {
					JOptionPane.showMessageDialog(null, "You cannot insert more than 10 elements");
				} catch (GUIExceptionDuplicateValue error) {
					JOptionPane.showMessageDialog(null, "Please insert only unique integers");
				}
			}
		});
		GridBagConstraints gbc_InsertTextField = new GridBagConstraints();
		gbc_InsertTextField.insets = new Insets(0, 0, 5, 0);
		gbc_InsertTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_InsertTextField.gridx = 6;
		gbc_InsertTextField.gridy = 0;
		contentPane.add(InsertTextField, gbc_InsertTextField);
		InsertTextField.setColumns(10);

		ArrayDisplayLabel = new JLabel("a = []");
		ArrayDisplayLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_ArrayDisplayLabel = new GridBagConstraints();
		gbc_ArrayDisplayLabel.insets = new Insets(0, 0, 5, 0);
		gbc_ArrayDisplayLabel.gridwidth = 7;
		gbc_ArrayDisplayLabel.gridx = 0;
		gbc_ArrayDisplayLabel.gridy = 1;
		contentPane.add(ArrayDisplayLabel, gbc_ArrayDisplayLabel);

		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 7;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 2;
		contentPane.add(panel, gbc_panel);

		lblNewLabel_1 = new JLabel("a[");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		panel.add(lblNewLabel_1);

		IndexTextField = new JTextField();
		IndexTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String indexValue = IndexTextField.getText();
					int indexVal = Integer.parseInt(indexValue);
					int arrayValue = array[indexVal];
					if (indexVal >= index) {
						throw new ArrayIndexOutOfBoundsException();
					}
					ValueTextField.setText(arrayValue + "");
				} catch (NumberFormatException error) {
					JOptionPane.showMessageDialog(null, "Only input numbers!!!");
				} catch (ArrayIndexOutOfBoundsException error) {
					JOptionPane.showMessageDialog(null, "Index not found.");
				}
			}
		});
		panel.add(IndexTextField);
		IndexTextField.setColumns(10);

		lblNewLabel_2 = new JLabel("] = ");
		panel.add(lblNewLabel_2);

		ValueTextField = new JTextField();
		ValueTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String arrayValue = ValueTextField.getText();
					int searchValue = Integer.parseInt(arrayValue);
					int i;
					for (i = 0; i < index; i++) {
						if (array[i] == searchValue) {
							IndexTextField.setText(i + "");
							break;
						}
					}
					if (i == index) {
						throw new GUIExceptionsNumberNotFound("Number Does Not Exist");
					}
				} catch (NumberFormatException error) {
					JOptionPane.showMessageDialog(null, "Please enter only integer values.");
				} catch (GUIExceptionsNumberNotFound error) {
					JOptionPane.showMessageDialog(null, "Number not found in array.");
				}
			}
		});
		panel.add(ValueTextField);
		ValueTextField.setColumns(10);
	}

}
