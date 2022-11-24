import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class MainApplication {
	public static void main(String[] args) {
		MainApplication app = new MainApplication();
		app.doRead();
		
	}
	
	public ArrayList<Boolean> doRead() {
		ArrayList<Boolean> flage = new ArrayList();
		FileInputStream fileObject;
		try {
			fileObject = new FileInputStream("data.txt");
		
		Scanner x = new Scanner(fileObject);
		 
		 
		while(x.hasNext()){
		String lineContent[] = x.nextLine().split(":");
		if(lineContent[0].equals("UserName")&&
				lineContent[1].length()>0) {
			flage.add(true);
		}
		if(lineContent[0].equals("Password")&&
				lineContent[1].length()>0) {
			flage.add(true);
		}
		
	}
		LoginDialog login = new LoginDialog();
		login.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		login.setVisible(true);
		
		
		} catch (FileNotFoundException e) {
		RegisterDialog register = new RegisterDialog();
		register.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		register.setVisible(true);
	}
		return flage;
		}
	
	
}
