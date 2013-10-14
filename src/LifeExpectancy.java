
public class LifeExpectancy {

	public void start() {
		System.out.println("Please enter your name: ");
		String name = Keyboard.readInput();
		
		System.out.println("Please enter your age: ");
		String age = Keyboard.readInput();
		
		int a = Integer.parseInt(age);
		System.out.println("You can live another " + (77 - a) + " years.");
	}
	
}
