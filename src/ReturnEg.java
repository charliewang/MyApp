
public class ReturnEg {

	public void start() {
	
		System.out.print("Enter your first name please: ");
		String firstName = Keyboard.readInput();
		
		System.out.print("Enter your last name please: ");
		String lastName = Keyboard.readInput();
		
		String initials = getInitials(firstName, lastName);
		System.out.print(initials);
	}

	private String getInitials(String firstName, String lastName) {
		String initials = "";
		initials += getFirstLetter(firstName) + ".";
		initials += getFirstLetter(lastName) + ".";
		return initials;
	}

	private String getFirstLetter(String word) {
		return word.substring(0, 1);
	}

}
