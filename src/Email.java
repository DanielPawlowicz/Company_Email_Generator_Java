
public class Email {

	String name;
	String surname;
	Department department;
	String company;
	
	Email(String name, String surname, Department department, String company){
		this.name = name;
		this.surname = surname;
		this.department = department;
		this.company = company;
	}
	
	Email(String name, String surname, String company){
		this.name = name;
		this.surname = surname;
		this.department = null;
		this.company = company;
	}

	private void generateEmail() {
		// TODO Auto-generated method stub
		
	}
	
}