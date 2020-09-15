package fi.kauhanen.viikko2Harj3.domain;

public class Friends {
	private String firstName;
	private String lastName;
	
	public Friends() {
		super();
	}

	public Friends(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Friends [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	


	
}
