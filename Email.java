import java.util.Scanner;

public class Email {

	Scanner in = new Scanner(System.in);
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private String alternateEmail;
	private int defaultPasswordLength = 10;
	private String companySuffix = "company.com";
	
	
	// Constructor to receive the first name and last name
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		// Call a method asking for the department - return department
		this.department = setDepartment();
		
		// Call a method that returns random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is : " + this.password);
		
		// Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		
	}

	// Ask for the department
	private String setDepartment() {
		System.out.print("New worker: " + firstName + " " + lastName + " " + "\nDepartment Codes " + "\n1 for sales \n2 for development \n3 for accounting \n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {return "sales"; }
		else if (depChoice == 2) {return "development"; }
		else if (depChoice == 3) {return "accounting"; }
		else {return ""; }
		}
	

	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVXYZ1234567890!?#%&";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
		
	// Set alternate email
	public void setAlternateEmail (String altEmail) {
	this.alternateEmail = altEmail;
}
	
	// Change the password 
	public void setChangePassword(String password) {
		this.password = password;
	}
	
	public String getAlternateEmail() {return alternateEmail; }
	public String getPassword() {return password; }
	
	public String showInfo() {
		return "Display Name: " + firstName + " " + lastName + 
				"\nCompany Email: " + email +
				"\nAlternate Email: " + alternateEmail;
	}
	}
