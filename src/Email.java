
public class Email {

	String name;
	String surname;
	String department;
	String company;
	String email;
	String password;
	String alternateEmail;
	
	Email(String name, String surname, String depart, String company){
		this.name = name;
		this.surname = surname;
		this.department = depart;
		this.company = company;
//		displayData();
		generateEmail();
//		System.out.println(email);
		this.showEmail();
	}
	
	Email(String name, String surname, String company){
		this.name = name;
		this.surname = surname;
		this.department = null;
		this.company = company;
//		displayData();
		generateEmail();
//		System.out.println(email);
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
			email = this.name + "." + this.surname + "@" + this.department + "." + this.company + ".com";
		else
			email = this.name + "." + this.surname + "@" + this.company + ".com";
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
