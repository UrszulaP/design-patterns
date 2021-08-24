package memento;

//memento
public class EmployeeMemento {

	private String name;  // we can choose fields that we want to store (no address field)
	private String phone;

	public EmployeeMemento(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	} // no setters - we set through the constructor
	
	public String getPhone() {
		return phone;
	}
}
