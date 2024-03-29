import java.util.Scanner;

public class Email {

	String name;
	String surname;
	String department;
	String company;
	String email;
	String password;
	String alternativeEmail;
	int PASS_LENGTH = 8;
	
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
		this.assignAlternativeEmail();
		this.generateEmail();
//		this.showEmail();
		this.generatePassword();
//		this.showPassword();
		
		this.displayData();
	}
	
	private void displayData() {
//		System.out.println(this.name);
//		System.out.println(this.surname);
//		System.out.println(this.department);
//		System.out.println(this.company);
		
		System.out.println("_______________________________________________________");
		System.out.println("            Email:  "+this.email);
		System.out.println("         Password:  "+this.password);
		System.out.println("Alternative email:  "+this.alternativeEmail);
		System.out.println("-------------------------------------------------------");
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
		String passwordSet = "QWERTYUIOPASDFGHJKLZXCVBNM1234567890!@#$%&";
		String passw = "";
		for(int i = 0; i < PASS_LENGTH; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			passw += passwordSet.charAt(rand);
			this.password = passw;
		}
	}
	
	private String getPassword() {
		return this.password;
	}
	
	private void showPassword() {
		System.out.println(this.password);
	}
	
	private void assignAlternativeEmail() {
		Scanner scanner = new Scanner(System.in);
		while(true) {			
			System.out.println("Enter alternate email: ");
			this.alternativeEmail = scanner.nextLine();
			if(alternativeEmail.contains("@"))
				break;
			else
				System.out.println("Enter valid email address. Try again");
		}
		System.out.println("Alternative email address assigned succesfully");
	}
	
}
