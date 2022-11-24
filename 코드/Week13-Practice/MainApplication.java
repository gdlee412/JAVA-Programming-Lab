import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class MainApplication {
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) {
		MainApplication app = new MainApplication();
		if (app.doRead()) {
			LoginDialog login = new LoginDialog();
			login.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			login.setVisible(true);
		}
	}
	
	private boolean doRead() {
		boolean flage = false;
		try {
			FileInputStream fileObject = new FileInputStream("data.txt");
			Scanner x = new Scanner(fileObject);
			String s =new String();
			//String Userline[] = x.nextLine().split(":");
			while(x.hasNext()){
				String Userline[] = x.nextLine().split(":");
				//System.out.println(Userline[0].toString());
				if (Userline[0].equals("UserName")&& Userline[1].length()>0) {
					System.out.println(Userline[1]);
					 
				}
				if (Userline[0].equals("Password") && Userline[1].length()>0) {
					System.out.println(Userline[1]);
					
				}
				flage = true;
			}
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			flage = false;
			RegisterDialog registerDialog= new RegisterDialog();
			registerDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			registerDialog.setVisible(true);
		}
		
		return flage;
	}
}
