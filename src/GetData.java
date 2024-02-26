

public class GetData {

	GetData(){
		
	}
	
	public void askForData() {
		String name = null;
		String surname = null;
		Department depart = null;
		String company = null;
		Email email;
		
		// Asking for input
		
		// creating Email
		if(depart != null)
			email = new Email(name, surname, depart, company);
		else
			email = new Email(name, surname, company);
	}
	
}
