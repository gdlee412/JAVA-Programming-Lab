import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldName;
	private JTextField textFieldUserName;
	private JTextField textFieldPassword;
	private JTextField textFieldConfirmPassword;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegisterDialog dialog = new RegisterDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegisterDialog() {
		setTitle("Secret Notepad Registration Form");
		setBounds(100, 100, 344, 487);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(10, 2, 0, 0));
		{
			JLabel lblName = new JLabel("Full Name");
			contentPanel.add(lblName);
		}
		{
			textFieldName = new JTextField();
			contentPanel.add(textFieldName);
			textFieldName.setColumns(10);
		}
		{
			JLabel lblGender = new JLabel("Gender");
			contentPanel.add(lblGender);
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			{
				 rdbtnMale = new JRadioButton("Male");
				panel.add(rdbtnMale);
			}
			{
				 rdbtnFemale = new JRadioButton("Female");
				panel.add(rdbtnFemale);
			}
			ButtonGroup G = new ButtonGroup();
			G.add(rdbtnFemale);
			G.add(rdbtnMale);

		}
		{
			JLabel lblUserName = new JLabel("User Name");
			contentPanel.add(lblUserName);
		}
		{
			textFieldUserName = new JTextField ();
			contentPanel.add(textFieldUserName);
			textFieldUserName.setColumns(10);
		}
		{
			JLabel lblPassword = new JLabel("Password");
			contentPanel.add(lblPassword);
		}
		{
			textFieldPassword = new JPasswordField();
			textFieldPassword.setColumns(10);
			contentPanel.add(textFieldPassword);
		}
		{
			JLabel lblConfirmPassword = new JLabel("Confirm Password");
			contentPanel.add(lblConfirmPassword);
		}
		{
			textFieldConfirmPassword = new JPasswordField();
			textFieldConfirmPassword.setColumns(10);
			contentPanel.add(textFieldConfirmPassword);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Register");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							FileOutputStream file = new FileOutputStream("userData.txt");
							PrintWriter buffer = new PrintWriter(file);
							buffer.println("Fullname:" + textFieldName.getText());
							if(rdbtnMale.isSelected())
							{
								buffer.println("Gender:Male");
							}
							else if(rdbtnFemale.isSelected())
							{
								buffer.println("Gender:Female");
							}
							else
							{
								buffer.println("Gender:Unknown");
							}
							buffer.println("Username:" + textFieldUserName.getText());
							if(textFieldPassword.getText().equals(textFieldConfirmPassword.getText()))
							{
								buffer.println("Password:" + textFieldPassword.getText());
							}
							else
							{
								throw new Exception();
							}
							buffer.close();
							file.close();
							
							JOptionPane.showMessageDialog(RegisterDialog.this, "Thank you. Registration was successful.");
							LoginDialog loginWindow = new LoginDialog();
							loginWindow.setVisible(true);
							dispose();
						
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});
				 
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				 
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	

}
