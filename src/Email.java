
public class Email {

	String name;
	String surname;
	String department;
	String company;
	String password;
	String alternateEmail;
	
	Email(String name, String surname, String depart, String company){
		this.name = name;
		this.surname = surname;
		this.department = depart;
		this.company = company;
		displayData();
	}
	
	Email(String name, String surname, String company){
		this.name = name;
		this.surname = surname;
		this.department = null;
		this.company = company;
		displayData();
	}
	
	private void displayData() {
		System.out.println(this.name);
		System.out.println(this.surname);
		System.out.println(this.department);
		System.out.println(this.company);
	}

	private void generateEmail() {
		// TODO Auto-generated method stub
		
	}
	
	private void generatePassword() {
		
	}
	
	private void addAlternateEmail() {
		
	}
	
}
