import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
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
		setBounds(100, 100, 344, 250);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(0, 2, 0, 0));
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
					
						doWrite();
						int res = JOptionPane.showOptionDialog(null, "Thank you \n You are registered",getTitle(), JOptionPane.DEFAULT_OPTION,
						        JOptionPane.INFORMATION_MESSAGE, null, null, null);
						if (res == 0) {
							
							LoginDialog login = new LoginDialog();
							login.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
							login.setVisible(true);
							dispose();
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
	
	public void doWrite(){
		
		
		//FileWriter fileObject =new FileWriter("data.txt",true);
		try {
		FileOutputStream fileObject =new FileOutputStream("data.txt",false);
		 
		PrintWriter x = new PrintWriter(fileObject);
		
		x.println("Name:"+textFieldName.getText());
		if (rdbtnMale.isSelected()) {
			x.println("Gender:Male");
		} else if(rdbtnFemale.isSelected()) {
			x.println("Gender:Female");
		} else {x.println("Gender:Unknown");}
		
		x.println("UserName:"+ textFieldUserName.getText());
		
		if (textFieldPassword.getText().equals(textFieldConfirmPassword.getText())) {
			x.println("Password:"+ textFieldPassword.getText());
			}
		x.close();
		}catch (Exception e) {
			 e.printStackTrace();
		}
		
	
		
	}
	
	

}
