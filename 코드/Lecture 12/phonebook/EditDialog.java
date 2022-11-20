package phonebook;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JTextField nameTxtField;
	private JLabel lblNewLabel_1;
	private JTextField phoneTxtField;

	/**
	 * Create the dialog.
	 */
	public EditDialog(JFrame parentFrame, String Name, String Phone) {
		super(parentFrame, true);
		setTitle("Edit Contact");
		setBounds(100, 100, 397, 122);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			lblNewLabel = new JLabel("Name:");
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.gridx = 1;
			gbc_lblNewLabel.gridy = 0;
			contentPanel.add(lblNewLabel, gbc_lblNewLabel);
		}
		{
			nameTxtField = new JTextField(Name);
			GridBagConstraints gbc_nameTxtField = new GridBagConstraints();
			gbc_nameTxtField.insets = new Insets(0, 0, 5, 0);
			gbc_nameTxtField.fill = GridBagConstraints.HORIZONTAL;
			gbc_nameTxtField.gridx = 3;
			gbc_nameTxtField.gridy = 0;
			contentPanel.add(nameTxtField, gbc_nameTxtField);
			nameTxtField.setColumns(10);
		}
		{
			lblNewLabel_1 = new JLabel("Phone Number:");
			GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
			gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
			gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
			gbc_lblNewLabel_1.gridx = 1;
			gbc_lblNewLabel_1.gridy = 1;
			contentPanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		}
		{
			phoneTxtField = new JTextField(Phone);
			GridBagConstraints gbc_phoneTxtField = new GridBagConstraints();
			gbc_phoneTxtField.fill = GridBagConstraints.HORIZONTAL;
			gbc_phoneTxtField.gridx = 3;
			gbc_phoneTxtField.gridy = 1;
			contentPanel.add(phoneTxtField, gbc_phoneTxtField);
			phoneTxtField.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
		if(Phone == "gone")
		{
			lblNewLabel_1.setVisible(false);
			phoneTxtField.setVisible(false);
		}
		
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	public String getName() {
		return nameTxtField.getText();
	}
	
	public String getPhone() {
		return phoneTxtField.getText();
	}

}
