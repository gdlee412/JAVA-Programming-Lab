import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class LoginDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldUserName;
	private JTextField textFieldPassword;
	NotePad mainapp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			LoginDialog dialog = new LoginDialog();
			dialog.setVisible(true);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public LoginDialog() {
		setTitle("Secret NotePad Login");
		setBounds(100, 100, 450, 185);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(2, 1, 0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			{
				JLabel lblUserName = new JLabel("User Name");
				panel.add(lblUserName);
			}
			{
				textFieldUserName = new JTextField();
				panel.add(textFieldUserName);
				textFieldUserName.setColumns(10);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			{
				JLabel lblPassword = new JLabel("Password");
				panel.add(lblPassword);
			}
			{
				textFieldPassword = new JPasswordField();
				textFieldPassword.setColumns(10);
				panel.add(textFieldPassword);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							FileInputStream file = new FileInputStream("userData.txt");
							Scanner buffer = new Scanner(file);
							LinkedList<Boolean> conditions = new LinkedList<>();
							while(buffer.hasNext())
							{
								String line = buffer.nextLine();
								String tokens[] = line.split(":");
								if(tokens[0].equals("Username"))
								{
									if(tokens[1].equals(textFieldUserName.getText()))
									{
										conditions.add(true);
									}
								}
								
								if(tokens[0].equals("Password"))
								{
									if(tokens[1].equals(textFieldPassword.getText()))
									{
										conditions.add(true);
									}
								}
							}
							
							if(conditions.size() == 2)
							{
								NotePad frame = new NotePad();
								frame.setVisible(true);
								dispose();
							}
							else
							{
								JOptionPane.showMessageDialog(LoginDialog.this, "Username or Password is incorrect. Please try again.");
							}
							
							
						} catch (Exception e1) {
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
