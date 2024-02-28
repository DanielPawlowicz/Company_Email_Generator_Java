import java.util.Scanner;

public class GetData {

	GetData(){
		
	}
	
	public void askForData() {
		String name = null;
		String surname = null;
		int choosedDepart = 0;
		String depart = null;
		String company = null;
		Email email;
		Scanner scanner;
		
		// Asking for input
			scanner = new Scanner(System.in);
			System.out.println("Enter the name: ");
			name = scanner.nextLine();
			System.out.println("Enter the surname: ");
			surname = scanner.nextLine();
			
			System.out.println("Choose the number of the department: \n"
					+ "0 - none \n"
					+ "1 Sales \n"
					+ "2 Development \n"
					+ "3 Accounting \n"
					+ "4 Management \n"
					+ "5 Human Resources");
			while(true) {
				choosedDepart = scanner.nextInt();
				if(choosedDepart == 0) {
					break;
				} else if (choosedDepart == 1) {
					depart = "sls";
					break;
				} else if (choosedDepart == 2) {
					depart = "dev";
					break;
				} else if (choosedDepart == 3) {
					depart = "acct";
					break;
				} else if (choosedDepart == 4) {
					depart = "mgmt";
					break;
				} else if (choosedDepart == 5) {
					depart = "hr";
					break;
				} else
					System.out.println("Invalid value - try again");
					
			}
			
			
			
		
		// creating Email
		if(depart != null)
			email = new Email(name, surname, depart, company);
		else
			email = new Email(name, surname, company);
	}
	
}
