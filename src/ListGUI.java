import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListGUI {

	private JFrame MainFrame;
	private JTextField AddNameTextField;
	private JTextField AddPhoneNumTextField;
	private JTextField AddEmailTextField;
	private JTextField AddDOBTextField;
	private JTextField AddAddressTextField;
	private JTextField SearchNameTextField;
	private JTextField SearchPhoneTextField;
	private JTextArea listArea;
	private JTextArea outputArea;
	private int count = 0;
	
	private AddressList addressList = new AddressList();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListGUI window = new ListGUI();
					window.MainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ListGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		MainFrame = new JFrame();
		MainFrame.setTitle("Address List");
		MainFrame.setBounds(100, 100, 850, 800);
		MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainFrame.getContentPane().setLayout(null);
		
		JPanel AddToListPanel = new JPanel();
		AddToListPanel.setBounds(12, 0, 348, 252);
		MainFrame.getContentPane().add(AddToListPanel);
		GridBagLayout gbl_AddToListPanel = new GridBagLayout();
		gbl_AddToListPanel.columnWidths = new int[]{113, 56, 0, 60, 0};
		gbl_AddToListPanel.rowHeights = new int[]{16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_AddToListPanel.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_AddToListPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		AddToListPanel.setLayout(gbl_AddToListPanel);
		
		JLabel AddToList_Header_Label = new JLabel("Add to List");
		AddToList_Header_Label.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblAddToList = new GridBagConstraints();
		gbc_lblAddToList.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddToList.gridx = 2;
		gbc_lblAddToList.gridy = 1;
		AddToListPanel.add(AddToList_Header_Label, gbc_lblAddToList);
		
		JLabel AddNameLabel = new JLabel("Name:");
		GridBagConstraints gbc_AddNameLabel = new GridBagConstraints();
		gbc_AddNameLabel.insets = new Insets(0, 0, 5, 5);
		gbc_AddNameLabel.gridx = 0;
		gbc_AddNameLabel.gridy = 3;
		AddToListPanel.add(AddNameLabel, gbc_AddNameLabel);
		
		AddNameTextField = new JTextField();
		GridBagConstraints gbc_AddNameTextField = new GridBagConstraints();
		gbc_AddNameTextField.gridwidth = 3;
		gbc_AddNameTextField.insets = new Insets(0, 0, 5, 0);
		gbc_AddNameTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_AddNameTextField.gridx = 1;
		gbc_AddNameTextField.gridy = 3;
		AddToListPanel.add(AddNameTextField, gbc_AddNameTextField);
		AddNameTextField.setColumns(10);
		
		JLabel AddPhoneNumLabel = new JLabel("Phone Number:");
		GridBagConstraints gbc_AddPhoneNumLabel = new GridBagConstraints();
		gbc_AddPhoneNumLabel.anchor = GridBagConstraints.EAST;
		gbc_AddPhoneNumLabel.insets = new Insets(0, 0, 5, 5);
		gbc_AddPhoneNumLabel.gridx = 0;
		gbc_AddPhoneNumLabel.gridy = 4;
		AddToListPanel.add(AddPhoneNumLabel, gbc_AddPhoneNumLabel);
		
		AddPhoneNumTextField = new JTextField();
		AddPhoneNumTextField.setColumns(10);
		GridBagConstraints gbc_AddPhoneNumTextField = new GridBagConstraints();
		gbc_AddPhoneNumTextField.gridwidth = 3;
		gbc_AddPhoneNumTextField.insets = new Insets(0, 0, 5, 0);
		gbc_AddPhoneNumTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_AddPhoneNumTextField.gridx = 1;
		gbc_AddPhoneNumTextField.gridy = 4;
		AddToListPanel.add(AddPhoneNumTextField, gbc_AddPhoneNumTextField);
		
		JLabel EmailLabel = new JLabel("Email Address:");
		GridBagConstraints gbc_EmailLabel = new GridBagConstraints();
		gbc_EmailLabel.anchor = GridBagConstraints.EAST;
		gbc_EmailLabel.insets = new Insets(0, 0, 5, 5);
		gbc_EmailLabel.gridx = 0;
		gbc_EmailLabel.gridy = 5;
		AddToListPanel.add(EmailLabel, gbc_EmailLabel);
		
		AddEmailTextField = new JTextField();
		AddEmailTextField.setColumns(10);
		GridBagConstraints gbc_AddEmailTextField = new GridBagConstraints();
		gbc_AddEmailTextField.gridwidth = 3;
		gbc_AddEmailTextField.insets = new Insets(0, 0, 5, 0);
		gbc_AddEmailTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_AddEmailTextField.gridx = 1;
		gbc_AddEmailTextField.gridy = 5;
		AddToListPanel.add(AddEmailTextField, gbc_AddEmailTextField);
		
		JLabel DOBLabel = new JLabel("Date of Birth:");
		GridBagConstraints gbc_DOBLabel = new GridBagConstraints();
		gbc_DOBLabel.anchor = GridBagConstraints.EAST;
		gbc_DOBLabel.insets = new Insets(0, 0, 5, 5);
		gbc_DOBLabel.gridx = 0;
		gbc_DOBLabel.gridy = 6;
		AddToListPanel.add(DOBLabel, gbc_DOBLabel);
		
		AddDOBTextField = new JTextField();
		AddDOBTextField.setColumns(10);
		GridBagConstraints gbc_AddDOBTextField = new GridBagConstraints();
		gbc_AddDOBTextField.gridwidth = 3;
		gbc_AddDOBTextField.insets = new Insets(0, 0, 5, 0);
		gbc_AddDOBTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_AddDOBTextField.gridx = 1;
		gbc_AddDOBTextField.gridy = 6;
		AddToListPanel.add(AddDOBTextField, gbc_AddDOBTextField);
		
		JLabel AddressLabel = new JLabel("Physical Address:");
		GridBagConstraints gbc_AddressLabel = new GridBagConstraints();
		gbc_AddressLabel.anchor = GridBagConstraints.EAST;
		gbc_AddressLabel.insets = new Insets(0, 0, 5, 5);
		gbc_AddressLabel.gridx = 0;
		gbc_AddressLabel.gridy = 7;
		AddToListPanel.add(AddressLabel, gbc_AddressLabel);
		
		AddAddressTextField = new JTextField();
		AddAddressTextField.setColumns(10);
		GridBagConstraints gbc_AddAddressTextField = new GridBagConstraints();
		gbc_AddAddressTextField.gridwidth = 3;
		gbc_AddAddressTextField.insets = new Insets(0, 0, 5, 0);
		gbc_AddAddressTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_AddAddressTextField.gridx = 1;
		gbc_AddAddressTextField.gridy = 7;
		AddToListPanel.add(AddAddressTextField, gbc_AddAddressTextField);
		
		JButton addToFrontButton = new JButton("Add Info to Front");
		addToFrontButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code here for when addToFrontButton pressed
				System.out.println("AddToFrontButton Pressed!!!");
				
				addToFront();
			}
		});
		GridBagConstraints gbc_addToFrontButton = new GridBagConstraints();
		gbc_addToFrontButton.gridwidth = 2;
		gbc_addToFrontButton.insets = new Insets(0, 0, 5, 5);
		gbc_addToFrontButton.gridx = 1;
		gbc_addToFrontButton.gridy = 8;
		AddToListPanel.add(addToFrontButton, gbc_addToFrontButton);
		
		JButton addToBackButton = new JButton("Add Info to Back");
		addToBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code here for when addToBackButton pressed
				System.out.println("AddToBackButton Pressed!!!");
				
				addToBack();
			}
		});
		GridBagConstraints gbc_addToBackButton = new GridBagConstraints();
		gbc_addToBackButton.gridwidth = 2;
		gbc_addToBackButton.insets = new Insets(0, 0, 5, 5);
		gbc_addToBackButton.gridx = 1;
		gbc_addToBackButton.gridy = 9;
		AddToListPanel.add(addToBackButton, gbc_addToBackButton);
		
		JPanel SearchTheListPanel = new JPanel();
		SearchTheListPanel.setBounds(12, 253, 348, 243);
		MainFrame.getContentPane().add(SearchTheListPanel);
		GridBagLayout gbl_SearchTheListPanel = new GridBagLayout();
		gbl_SearchTheListPanel.columnWidths = new int[]{131, 85, 0};
		gbl_SearchTheListPanel.rowHeights = new int[]{16, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_SearchTheListPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_SearchTheListPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		SearchTheListPanel.setLayout(gbl_SearchTheListPanel);
		
		JLabel SearchTheList_Header_Label = new JLabel("Search the List");
		SearchTheList_Header_Label.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_SearchTheList_Header_Label = new GridBagConstraints();
		gbc_SearchTheList_Header_Label.insets = new Insets(0, 0, 5, 0);
		gbc_SearchTheList_Header_Label.gridx = 1;
		gbc_SearchTheList_Header_Label.gridy = 1;
		SearchTheListPanel.add(SearchTheList_Header_Label, gbc_SearchTheList_Header_Label);
		
		JLabel SearchNameLabel = new JLabel("Name:");
		GridBagConstraints gbc_SearchNameLabel = new GridBagConstraints();
		gbc_SearchNameLabel.anchor = GridBagConstraints.EAST;
		gbc_SearchNameLabel.insets = new Insets(0, 0, 5, 5);
		gbc_SearchNameLabel.gridx = 0;
		gbc_SearchNameLabel.gridy = 2;
		SearchTheListPanel.add(SearchNameLabel, gbc_SearchNameLabel);
		
		SearchNameTextField = new JTextField();
		SearchNameTextField.setColumns(10);
		GridBagConstraints gbc_SearchNameTextField = new GridBagConstraints();
		gbc_SearchNameTextField.insets = new Insets(0, 0, 5, 0);
		gbc_SearchNameTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_SearchNameTextField.gridx = 1;
		gbc_SearchNameTextField.gridy = 2;
		SearchTheListPanel.add(SearchNameTextField, gbc_SearchNameTextField);
		
		JLabel SearchPhoneNumLabel = new JLabel("Phone Number:");
		GridBagConstraints gbc_SearchPhoneNumLabel = new GridBagConstraints();
		gbc_SearchPhoneNumLabel.anchor = GridBagConstraints.EAST;
		gbc_SearchPhoneNumLabel.insets = new Insets(0, 0, 5, 5);
		gbc_SearchPhoneNumLabel.gridx = 0;
		gbc_SearchPhoneNumLabel.gridy = 3;
		SearchTheListPanel.add(SearchPhoneNumLabel, gbc_SearchPhoneNumLabel);
		
		SearchPhoneTextField = new JTextField();
		SearchPhoneTextField.setColumns(10);
		GridBagConstraints gbc_SearchPhoneTextField = new GridBagConstraints();
		gbc_SearchPhoneTextField.insets = new Insets(0, 0, 5, 0);
		gbc_SearchPhoneTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_SearchPhoneTextField.gridx = 1;
		gbc_SearchPhoneTextField.gridy = 3;
		SearchTheListPanel.add(SearchPhoneTextField, gbc_SearchPhoneTextField);
		
		JButton SearchPhoneByNameButton = new JButton("Search Phone by Name");
		SearchPhoneByNameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code here for when SearchPhoneByNameButton pressed
				System.out.println("SearchPhoneByNameButton Pressed!!!");
				
				showPhoneByName();
			}
		});
		GridBagConstraints gbc_SearchPhoneByNameButton = new GridBagConstraints();
		gbc_SearchPhoneByNameButton.insets = new Insets(0, 0, 5, 0);
		gbc_SearchPhoneByNameButton.gridx = 1;
		gbc_SearchPhoneByNameButton.gridy = 4;
		SearchTheListPanel.add(SearchPhoneByNameButton, gbc_SearchPhoneByNameButton);
		
		JButton SearchNameByPhoneButton = new JButton("Search Name by Phone");
		SearchNameByPhoneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code here for when SearchNameByPhoneButton pressed
				System.out.println("SearchNameByPhoneButton Pressed!!!");
			
				showNameByPhone();
			}
		});
		GridBagConstraints gbc_SearchNameByPhoneButton = new GridBagConstraints();
		gbc_SearchNameByPhoneButton.insets = new Insets(0, 0, 5, 0);
		gbc_SearchNameByPhoneButton.gridx = 1;
		gbc_SearchNameByPhoneButton.gridy = 5;
		SearchTheListPanel.add(SearchNameByPhoneButton, gbc_SearchNameByPhoneButton);
		
		JButton SearchEmailByNameButton = new JButton("Search Email by Name");
		SearchEmailByNameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code here for when SearchEmailByNameButton pressed
				System.out.println("SearchEmailByNameButton Pressed!!!");
			
				showEmailByName();
			}
		});
		GridBagConstraints gbc_SearchEmailByNameButton = new GridBagConstraints();
		gbc_SearchEmailByNameButton.insets = new Insets(0, 0, 5, 0);
		gbc_SearchEmailByNameButton.gridx = 1;
		gbc_SearchEmailByNameButton.gridy = 6;
		SearchTheListPanel.add(SearchEmailByNameButton, gbc_SearchEmailByNameButton);
		
		JButton SearchDOBbyNameButton = new JButton("Search DOB by Name");
		SearchDOBbyNameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code here for when SearchDOBbyNameButton pressed
				System.out.println("SearchDOBbyNameButton Pressed!!!");
			
				showDOBbyName();
			}
		});
		GridBagConstraints gbc_SearchDOBbyNameButton = new GridBagConstraints();
		gbc_SearchDOBbyNameButton.gridx = 1;
		gbc_SearchDOBbyNameButton.gridy = 7;
		SearchTheListPanel.add(SearchDOBbyNameButton, gbc_SearchDOBbyNameButton);
		
		JPanel OtherListOpsPanel = new JPanel();
		OtherListOpsPanel.setBounds(12, 509, 348, 252);
		MainFrame.getContentPane().add(OtherListOpsPanel);
		GridBagLayout gbl_OtherListOpsPanel = new GridBagLayout();
		gbl_OtherListOpsPanel.columnWidths = new int[]{113, 121, 0};
		gbl_OtherListOpsPanel.rowHeights = new int[]{16, 0, 0, 0, 0, 0, 0, 0};
		gbl_OtherListOpsPanel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_OtherListOpsPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		OtherListOpsPanel.setLayout(gbl_OtherListOpsPanel);
		
		JLabel OtherListOperations_Header_Label = new JLabel("Other List Operations");
		OtherListOperations_Header_Label.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_OtherListOperations_Header_Label = new GridBagConstraints();
		gbc_OtherListOperations_Header_Label.insets = new Insets(0, 0, 5, 0);
		gbc_OtherListOperations_Header_Label.gridx = 1;
		gbc_OtherListOperations_Header_Label.gridy = 0;
		OtherListOpsPanel.add(OtherListOperations_Header_Label, gbc_OtherListOperations_Header_Label);
		
		JButton toStringButton = new JButton("ToString");
		toStringButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code here for when toStringButton pressed
				System.out.println("toStringButton Pressed!!!");
				
				showToString();
			}
		});
		GridBagConstraints gbc_toStringButton = new GridBagConstraints();
		gbc_toStringButton.insets = new Insets(0, 0, 5, 0);
		gbc_toStringButton.gridx = 1;
		gbc_toStringButton.gridy = 1;
		OtherListOpsPanel.add(toStringButton, gbc_toStringButton);
		
		JButton isEmptyButton = new JButton("IsEmpty");
		isEmptyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code here for when isEmptyButton pressed
				System.out.println("isEmptyButton Pressed!!!");
				
				showIsEmpty();
			}
		});
		GridBagConstraints gbc_isEmptyButton = new GridBagConstraints();
		gbc_isEmptyButton.insets = new Insets(0, 0, 5, 0);
		gbc_isEmptyButton.gridx = 1;
		gbc_isEmptyButton.gridy = 2;
		OtherListOpsPanel.add(isEmptyButton, gbc_isEmptyButton);
		
		JButton reverseToStringButton = new JButton("ReverseToString");
		reverseToStringButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code here for when reverseToStringButton pressed
				System.out.println("reverseToStringButton Pressed!!!");
				
				showRevToString();
			}
		});
		GridBagConstraints gbc_reverseToStringButton = new GridBagConstraints();
		gbc_reverseToStringButton.insets = new Insets(0, 0, 5, 0);
		gbc_reverseToStringButton.gridx = 1;
		gbc_reverseToStringButton.gridy = 3;
		OtherListOpsPanel.add(reverseToStringButton, gbc_reverseToStringButton);
		
		JButton SizeOfButton = new JButton("SizeOf");
		SizeOfButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code here for when SizeOfButton pressed
				System.out.println("SizeOfButton Pressed!!!");
				
				showSizeOf();
			}
		});
		GridBagConstraints gbc_SizeOfButton = new GridBagConstraints();
		gbc_SizeOfButton.insets = new Insets(0, 0, 5, 0);
		gbc_SizeOfButton.gridx = 1;
		gbc_SizeOfButton.gridy = 4;
		OtherListOpsPanel.add(SizeOfButton, gbc_SizeOfButton);
		
		JButton ReverseButton = new JButton("Reverse");
		ReverseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code here for when ReverseButton pressed
				System.out.println("ReverseButton Pressed!!!");
				
				showRev();
			}
		});
		GridBagConstraints gbc_ReverseButton = new GridBagConstraints();
		gbc_ReverseButton.insets = new Insets(0, 0, 5, 0);
		gbc_ReverseButton.gridx = 1;
		gbc_ReverseButton.gridy = 5;
		OtherListOpsPanel.add(ReverseButton, gbc_ReverseButton);
		
		JButton TestListButton = new JButton("Insert Test List");
		TestListButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code here for when TestListButton pressed
				System.out.println("TestListButton Pressed!!!");
				
				addTestList();
			}
		});
		GridBagConstraints gbc_TestListButton = new GridBagConstraints();
		gbc_TestListButton.gridx = 1;
		gbc_TestListButton.gridy = 6;
		OtherListOpsPanel.add(TestListButton, gbc_TestListButton);
		
		JPanel CurrentListPanel = new JPanel();
		CurrentListPanel.setBounds(394, 0, 327, 506);
		MainFrame.getContentPane().add(CurrentListPanel);
		CurrentListPanel.setLayout(null);
		
		listArea = new JTextArea();
		
		JScrollPane ListOutput_scrollPane = new JScrollPane(listArea);
		ListOutput_scrollPane.setBounds(12, 42, 303, 451);
		CurrentListPanel.add(ListOutput_scrollPane);
		ListOutput_scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		JLabel CurrentList_Header_Label = new JLabel("Current List");
		CurrentList_Header_Label.setFont(new Font("Tahoma", Font.BOLD, 15));
		CurrentList_Header_Label.setBounds(125, 13, 101, 16);
		CurrentListPanel.add(CurrentList_Header_Label);
		
		JPanel OutputPanel = new JPanel();
		OutputPanel.setBounds(383, 509, 348, 252);
		MainFrame.getContentPane().add(OutputPanel);
		OutputPanel.setLayout(null);
		
		JLabel Output_Header_Label = new JLabel("Output");
		Output_Header_Label.setFont(new Font("Tahoma", Font.BOLD, 15));
		Output_Header_Label.setBounds(141, 5, 59, 16);
		OutputPanel.add(Output_Header_Label);
		
		outputArea = new JTextArea();
		
		JScrollPane ConsoleOutput_scrollPane = new JScrollPane(outputArea);
		ConsoleOutput_scrollPane.setBounds(12, 39, 324, 200);
		ConsoleOutput_scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		OutputPanel.add(ConsoleOutput_scrollPane);
	}
	
	public void addTestList(){
				
		if(count == 0){
			AddNameTextField.setText("Daniel Jordan");
			AddPhoneNumTextField.setText("540-315-6343");
			AddEmailTextField.setText("djordan7038@gmail.com");
			AddDOBTextField.setText("12/18/1991");
			AddAddressTextField.setText("405 Oak Tree Blvd. NW Christiansburg, VA 24073");
			count++;
		}
		else if (count == 1){
			AddNameTextField.setText("Jenna Stallard");
			AddPhoneNumTextField.setText("276-219-7356");
			AddEmailTextField.setText("jstallard2016@gmail.com");
			AddDOBTextField.setText("7/15/1994");
			AddAddressTextField.setText("405 Oak Tree Blvd. NW Christiansburg, VA 24073");
			count++;
		}
		else if(count == 2){
			AddNameTextField.setText("John Snow");
			AddPhoneNumTextField.setText("192-168-0001");
			AddEmailTextField.setText("lordCommander@thewall.com");
			AddDOBTextField.setText("12/25/1906");
			AddAddressTextField.setText("The Wall, Westeros");
			count++;
		}
		else if(count == 3){
			AddNameTextField.setText("Daenerys Targaryen");
			AddPhoneNumTextField.setText("1-800-FLY-DGON");
			AddEmailTextField.setText("motherOfDragons@Khaleesi.com");
			AddDOBTextField.setText("12/25/1906");
			AddAddressTextField.setText("Dothraki Sea, Essos");
			count++;
		}
		else if(count == 4){
			AddNameTextField.setText("Jamie Lannister");
			AddPhoneNumTextField.setText("606-785-9854");
			AddEmailTextField.setText("iLoveMySister@kingsguard.com");
			AddDOBTextField.setText("1/01/1906");
			AddAddressTextField.setText("King's Landing, Westeros");
			count++;
		}
		else if(count == 5){
			AddNameTextField.setText("Tyrion Lannister");
			AddPhoneNumTextField.setText("205-421-7852");
			AddEmailTextField.setText("iDrinkandIKNowThings@imp.com");
			AddDOBTextField.setText("6/12/1906");
			AddAddressTextField.setText("Dothraki Sea, Essos");
			count++;
		}
	}
	
	public void addToFront(){
		String name = AddNameTextField.getText();
		String tel = AddPhoneNumTextField.getText();
		String email = AddEmailTextField.getText();
		String addr = AddAddressTextField.getText();
		String dob = AddDOBTextField.getText();
		
		addressList.addToFront(name, tel, email, addr, dob);
		
		listArea.setText(addressList.toString());
		
		AddNameTextField.setText("");
		AddPhoneNumTextField.setText("");
		AddEmailTextField.setText("");
		AddAddressTextField.setText("");
		AddDOBTextField.setText("");
	}
	
	public void addToBack(){
		String name = AddNameTextField.getText();
		String tel = AddPhoneNumTextField.getText();
		String email = AddEmailTextField.getText();
		String addr = AddAddressTextField.getText();
		String dob = AddDOBTextField.getText();
		
		addressList.addToBack(name, tel, email, addr, dob);
		
		listArea.setText(addressList.toString());
		
		AddNameTextField.setText("");
		AddPhoneNumTextField.setText("");
		AddEmailTextField.setText("");
		AddAddressTextField.setText("");
		AddDOBTextField.setText("");
	}
	
	public void showSizeOf(){
		
		outputArea.setText("");
		outputArea.setText("The size of the current list is " + addressList.sizeOf());
	}
	
	public void showIsEmpty(){
		
		outputArea.setText("");
		if(addressList.isEmpty()){
			outputArea.setText("The current list is not empty.");
		}
		else{
			outputArea.setText("The current list is empty.");
		}	
	}
	
	public void showToString(){
		
		outputArea.setText("");
		if(!addressList.isEmpty()){
			outputArea.setText("There is no info in the list.");
		}
		else{
			outputArea.setText(addressList.toString());
		}
	}
	
	public void showPhoneByName(){
		
		String name = SearchNameTextField.getText();
		outputArea.setText("Name entered: " +  name + "\n" +
				           "Corresponding Phone: " + addressList.phoneNumberByName(name));
		SearchNameTextField.setText("");
	}
	
	public void showNameByPhone(){
		
		String phone = SearchPhoneTextField.getText();
		outputArea.setText("Phone Number entered: " + phone + "\n" +
				           "Corresponding Name: " + addressList.nameByPhoneNumber(phone));
		SearchPhoneTextField.setText("");
	}
	
	public void showEmailByName(){
		
		String name = SearchNameTextField.getText();
		outputArea.setText("Name entered: " + name + "\n" +
				           "Corresponding Email: " + addressList.emailByName(name));
		SearchNameTextField.setText("");
	}
	
	public void showDOBbyName(){
		
		String name = SearchNameTextField.getText();
		outputArea.setText("Name entered: " + name + "\n" +
				           "Corresponding DOB: " + addressList.dobByName(name));
		SearchNameTextField.setText("");
	}
	
	public void showRevToString(){
		
		outputArea.setText("");
		outputArea.setText(addressList.reverseToString());
	}
	
	public void showRev(){
		
		outputArea.setText("");
		outputArea.setText("This feature will work in the next iteration. :''(");
	}
}
