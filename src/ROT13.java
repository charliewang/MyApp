
public class ROT13 {

	public void start() {
		String result = "";
		System.out.println("Enter the word (uppercase letters only): ");
		String input = Keyboard.readInput();
		
		int index = 0;
		while (index < input.length()) {
			char original = input.charAt(index);
			char encoded = (char) ((original - 'A' + 13) % 26 + 'A');
			result += encoded;
			index++;
		}
		System.out.println("The word is: " + result);
	}
	
}
