import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class NotePad extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmSave;
	private JMenuItem mntmNew;
	private JMenuItem mntmExit;
	private JMenu mnEdit;
	private JMenu mnHelp;
	private JMenuItem mntmCopy;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmCut;
	private JMenuItem mntmPast;
	private JMenuItem mntmAbout;
	private JMenuItem mntmOpen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotePad frame = new NotePad();
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
	public NotePad() {
		setTitle("Secret NotePad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		textArea = new JTextArea();
		scrollPane = new JScrollPane(textArea);
		
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		menuBar = new JMenuBar();
		scrollPane.setColumnHeaderView(menuBar);
		
		mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		mntmNew = new JMenuItem("New");
		mnFile.add(mntmNew);
		
		mntmOpen = new JMenuItem("Open");
		mnFile.add(mntmOpen);
		
		mntmSave = new JMenuItem("Save");
		mnFile.add(mntmSave);
		
		mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		mntmCopy = new JMenuItem("Copy");
		mnEdit.add(mntmCopy);
		
		mntmPast = new JMenuItem("Past");
		mnEdit.add(mntmPast);
		
		mntmNewMenuItem = new JMenuItem("Select All");
		mnEdit.add(mntmNewMenuItem);
		
		mntmCut = new JMenuItem("Cut");
		mnEdit.add(mntmCut);
		
		mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		mntmAbout = new JMenuItem("About");
		mnHelp.add(mntmAbout);
		
		 
	}

}
