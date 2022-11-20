package phonebook;

import java.awt.EventQueue;
import java.util.*;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.ListModel;

import java.awt.BorderLayout;
import javax.swing.JList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PhoneBook extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnActionMenu;
	private JMenuItem mnAddMenuItem;
	private JMenuItem mnDeleteMenuItem;
	private JMenuItem mnExitMenuItem;
	private JMenu mnCollectionMenu_1;
	private JMenuItem mnSortMenuItem;
	private JMenuItem mnShuffleMenuItem;
	private JMenuItem mnDuplicateMenuItem;
	private JMenuItem mnRemoveDMenuItem;
	private JScrollPane scrollPane;
	private JList list;
	List<String> listData = new ArrayList<String>();
	DefaultListModel<String> listModel = new DefaultListModel<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhoneBook frame = new PhoneBook();
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
	public PhoneBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnActionMenu = new JMenu("Action");
		menuBar.add(mnActionMenu);

		mnAddMenuItem = new JMenuItem("Add");
		mnAddMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditDialog createContact = new EditDialog(PhoneBook.this, "", "");
				String newContact = createContact.getName() + ": " + createContact.getPhone();
				
				//change data inside ArrayList
				listData.add(newContact);
				
				//replace all data of Model with new ArrayList
				listModel.clear();
				listModel.addAll(listData);
			}
		});
		mnActionMenu.add(mnAddMenuItem);

		mnDeleteMenuItem = new JMenuItem("Delete");
		mnDeleteMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditDialog deleteContact = new EditDialog(PhoneBook.this, "", "gone");
				String deleteName = deleteContact.getName();
				int deleteIndex = 0;
				for(String i:listData)
				{
					if(i.contains(deleteName))
					{
						deleteIndex = listData.indexOf(i);
						break;
					}
				}
				
				listData.remove(deleteIndex);
				listModel.clear();
				listModel.addAll(listData);
			}
		});
		mnActionMenu.add(mnDeleteMenuItem);

		mnExitMenuItem = new JMenuItem("Exit");
		mnExitMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnActionMenu.add(mnExitMenuItem);

		mnCollectionMenu_1 = new JMenu("Collection");
		menuBar.add(mnCollectionMenu_1);

		mnSortMenuItem = new JMenuItem("Sort");
		mnSortMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Collections.sort(listData);
				listModel.clear();
				listModel.addAll(listData);
			}
		});
		mnCollectionMenu_1.add(mnSortMenuItem);

		mnShuffleMenuItem = new JMenuItem("Shuffle");
		mnShuffleMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Collections.shuffle(listData);
				listModel.clear();
				listModel.addAll(listData);
			}
		});
		mnCollectionMenu_1.add(mnShuffleMenuItem);

		mnDuplicateMenuItem = new JMenuItem("Duplicate");
		mnDuplicateMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditDialog duplicateContact = new EditDialog(PhoneBook.this, "", "gone");
				String duplicateName = duplicateContact.getName();
				int duplicateIndex = 0;
				for(String i:listData)
				{
					if(i.contains(duplicateName))
					{
						duplicateIndex = listData.indexOf(i);
						break;
					}
				}
				
				listData.add(listData.get(duplicateIndex));
				listModel.clear();
				listModel.addAll(listData);
			}
		});
		mnCollectionMenu_1.add(mnDuplicateMenuItem);

		mnRemoveDMenuItem = new JMenuItem("Remove Duplicate");
		mnRemoveDMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<String> newList = new ArrayList<>(new HashSet<>(listData));
				listData = newList;
				listModel.clear();
				listModel.addAll(listData);
			}
		});
		mnCollectionMenu_1.add(mnRemoveDMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		// fill the ArrayList with phone contacts
		for (String contact : Contact.rawData) {
			listData.add(contact);
		}
		listModel.addAll(listData);

		list = new JList(listModel);
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int index = list.getSelectedIndex();
				String value = listModel.get(index);
				String [] splits = value.split(":");
				EditDialog editContact = new EditDialog(PhoneBook.this, splits[0], splits[1]);
				String ModifiedContact = editContact.getName() + ": " + editContact.getPhone();
				
				//change data inside ArrayList
				listData.set(index, ModifiedContact);
				
				//replace all data of Model with new ArrayList
				listModel.clear();
				listModel.addAll(listData);
				
			}
		});

		scrollPane = new JScrollPane(list);
		contentPane.add(scrollPane);

	}

}
