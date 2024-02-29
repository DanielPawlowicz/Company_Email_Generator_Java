
public class Email {

	String name;
	String surname;
	String department;
	String company;
	String email;
	String password;
	String alternateEmail;
	
	Email(String name, String surname, String depart, String company){
		this.department = depart;
		restOfConstructor(name, surname, company);
	}
	
	Email(String name, String surname, String company){
		this.department = null;
		restOfConstructor(name, surname, company);
	}
	
	private void restOfConstructor(String name, String surname, String company) {
		this.name = name;
		this.surname = surname;
		this.company = company;
		generateEmail();
		this.showEmail();
	}
	
	private void displayData() {
		System.out.println(this.name);
		System.out.println(this.surname);
		System.out.println(this.department);
		System.out.println(this.company);
	}

	private void generateEmail() {
		if(this.department != null)
			email = (this.name + "." + this.surname + "@" + this.department + "." + this.company + ".com").toLowerCase();
		else
			email = (this.name + "." + this.surname + "@" + this.company + ".com").toLowerCase();
	}
	
	private String getEmail() {
		return email;
	}
	
	private void showEmail() {
		System.out.println(email);
	}
	
	private void generatePassword() {
		
	}
	
	private void addAlternateEmail() {
		
	}
	
}
