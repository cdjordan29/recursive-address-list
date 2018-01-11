public class ListNode {
	
	private String name;
	private String tel; // Telephone number
	private String email;
	private String addr; // Address
	private String dob; // Date of birth
	private ListNode next; // Pointer to the next node
	
	ListNode(String name, String tel, String email, String addr, String dob)
	{
		this.name = name;
		this.tel = tel;
		this.email = email;
		this.addr = addr;
		this.dob = dob;
	} // end of the constructor
	
	public String getName() { return name; }
	public String getTel() { return tel; }
	public String getEmail() { return email; }
	public String getAddr() { return addr; }
	public String getDob() {return dob; }
	public void setName(String name) { this.name = name; }
	public void setTel(String tel) { this.tel = tel; }
	public void setEmail(String email) { this.email = email; }
	public void setAddr(String addr) { this.addr = addr; }
	public void setDob(String dob) { this.dob = dob; }
	public ListNode getNext() { return next; }
	public void setNext(ListNode link) { next = link; }
	public boolean haveNext() {
		if(next == null){
			return false;
		}
		else 
			return true;
	}
}
