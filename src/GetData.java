import java.util.Scanner;

public class GetData {

	GetData(){
		
	}
	
	public void askForData() {
		String name = null;
		String surname = null;
		Department depart = null;
		String company = null;
		Email email;
		Scanner scanner;
		
		// Asking for input
			scanner = new Scanner(System.in);
			System.out.println("Enter the name: ");
			name = scanner.nextLine();
			System.out.println("Enter the surname: ");
			surname = scanner.nextLine();
		
		
		// creating Email
		if(depart != null)
			email = new Email(name, surname, depart, company);
		else
			email = new Email(name, surname, company);
	}
	
}
