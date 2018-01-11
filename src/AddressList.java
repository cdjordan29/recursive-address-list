public class AddressList{

	/*
	 * Instance data for AddressList
	 */
	private ListNode head = null;
	private ListNode currentNode = null;
	private String strToRev;

	/**
	 * isEmpty checks to see if the list is empty or not
	 * @return true or false
	 */
	public boolean isEmpty(){
		if(head != null){
			return true;
		}
		else return false;
	}

	/**
	 * addToFront adds a new node to the front of the list
	 * @param name
	 * @param tel
	 * @param email
	 * @param address
	 * @param dob
	 */
	public void addToFront(String name, String tel, String email,
			String address, String dob){

		ListNode node = new ListNode(name, tel, email, address, dob);
		if(head != null){		
			node.setNext(head);
		}
		head = node;
	}

	/**
	 * addToBack adds a new node to the back of the list
	 * @param name
	 * @param tel
	 * @param email
	 * @param address
	 * @param dob
	 */
	public void addToBack(String name, String tel, String email,
			String address, String dob){
		addToBack(new ListNode(name, tel, email, address, dob));
	}

	/*
	 * private helper 1 for addToBack recursion
	 * @param node
	 */
	public void addToBack(ListNode node){

		if(this.head == null){
			this.head = node;
		}
		else{
			this.addToBack(this.head, node);
		}
	}

	/*
	 * private helper 2 for addToBack recursion
	 * @param current
	 * @param newNode
	 */
	public void addToBack(ListNode current, ListNode newNode){

		if(current.getNext() == null){
			current.setNext(newNode);
		}
		else{
			addToBack(current.getNext(), newNode);
		}
	}

	/**
	 * toString returns the data from each node
	 */
	public String toString(){
		String result = "[";
		result = result + getStrings(head);
		result = result.substring(0, result.length() - 1);
		result = result + "]";
		return result;
	}

	/*
	 * private helper for toString recursion
	 */
	private String getStrings(ListNode head){
		if(head.haveNext() == false){
			return "Name: " + head.getName() + "\n" +
					"Phone: " + head.getTel() + "\n" + 
					"Email: " + head.getEmail() + "\n" + 
					"Address: " + head.getAddr() + "\n" +
					"Date of Birth: " + head.getDob() + "\n";
		}
		else{
			return "Name: " + head.getName() + "\n" +
					"Phone: " + head.getTel() + "\n" + 
					"Email: " + head.getEmail() + "\n" + 
					"Address: " + head.getAddr() + "\n" +
					"Date of Birth: " + head.getDob() + "\n" +
					"\n" + getStrings(head.getNext());
		}
	}

	/**
	 * reverseToString returns the node info from last to first
	 * @return
	 */
	public String reverseToString(){
		
		return getReverseToString(head);
	}
	
	public String getReverseToString(ListNode node){
		
		if(node.haveNext()){
			getReverseToString(node.getNext());
		}
		
		strToRev += "Name: " + node.getName() + "\n" +
				"Phone: " + node.getTel() + "\n" + 
				"Email: " + node.getEmail() + "\n" + 
				"Address: " + node.getAddr() + "\n" +
				"Date of Birth: " + node.getDob() + "\n" +
				"\n";
		return strToRev;
	}

	/**
	 * reverse completely flips the entire list
	 * @return a new AddressList
	 */
	public AddressList reverse(){
		AddressList revList = new AddressList();
		return revList;
	}

	/**
	 * sizeOf returns the size of the list
	 * @return int, size of the list
	 */
	public int sizeOf(){
		return getSize(head);
	}

	/*
	 * private helper for sizeOf recursion
	 */
	public int getSize(ListNode node){
		if(node.haveNext() == false){
			return 1;
		}
		else{
			return 1 + getSize(node.getNext());
		}
	}

	/**
	 * phoneNumberByName returns corresponding phone number based on the name entered
	 * @param name
	 * @return str
	 */
	public String phoneNumberByName(String name){

		return getPhoneNumByName(name, head);
	}

	/*
	 * Private helper for phoneNumberByName
	 * @param name
	 * @param node
	 * @return string
	 */
	private String getPhoneNumByName(String name, ListNode node){

		if(node.getName().equals(name)){
			return node.getTel();
		}

		else if(node.haveNext() == false){
			return "No matching data";
		}

		else{
			return getPhoneNumByName(name, node.getNext());
		}
	}

	/**
	 * emailByName returns corresponding email based on the name entered
	 * @param name
	 * @return str
	 */
	public String emailByName(String name){

		return getEmailByName(name, head);
	}

	/*
	 * Private helper for emailByName
	 * @param name
	 * @param node
	 * @return string
	 */
	private String getEmailByName(String name, ListNode node){

		if(node.getName().equals(name)){
			return node.getEmail();
		}

		else if(node.haveNext() == false){
			return "No matching data";
		}

		else{
			return getEmailByName(name, node.getNext());
		}
	}
	/**
	 * nameByPhoneNumber returns corresponding name based on the phone number entered
	 * @param tel
	 * @return str
	 */
	public String nameByPhoneNumber(String tel){

		return getNameByPhoneNumber(tel, head);
	}

	/*
	 * Private helper for nameByPhoneNumber
	 * @param name
	 * @param node
	 * @return
	 */
	private String getNameByPhoneNumber(String tel, ListNode node){

		if(node.getTel().equals(tel)){
			return node.getName();
		}

		else if(node.haveNext() == false){
			return "No matching data";
		}

		else{
			return getNameByPhoneNumber(tel, node.getNext());
		}
	}

	/**
	 * dobByName returns corresponding DOB based on the name entered
	 * @param name
	 * @return str
	 */
	public String dobByName(String name){
		
		return getdobByName(name, head);
	}
	
	/*
	 * Private helper for dobByName 
	 * @param name
	 * @param node
	 * @return String 
	 */
	private String getdobByName(String name, ListNode node){

		if(node.getName().equals(name)){
			return node.getDob();
		}

		else if(node.haveNext() == false){
			return "No matching data";
		}

		else{
			return getdobByName(name, node.getNext());
		}
	}
} // end of class AddressList
