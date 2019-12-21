package question3;

public class Customer {
	
	//Fields
	private String name;
	private String password;
	
	//constructor
	public Customer(String name, String password) {
		this.name = name;
		this.password = password;
	}
	
	//setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
