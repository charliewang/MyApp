
public class FencePost {

	public void start(){
		
		// Read inputs from users
		int start = readInteger("Enter the starting position: ");
		int numberOfPosts = readInteger("Enter the number of posts: ");
		int distance = readInteger("Enter the distance to cover: ");
		System.out.println();
		printPostLocation(start, numberOfPosts, distance);
		
	}
	
	private int readInteger(String prompt) {
		System.out.println(prompt);
		String input = Keyboard.readInput();
		int value = Integer.parseInt(input);
		return value;
	}

	private void printPostLocation(int start, int numberOfPosts, int distance) {
		
		System.out.println("Fence post locations:");
		
		// Initialize values
		double gapSize = (double) distance / (numberOfPosts - 1); 
		int currentPost = 0;
		
		while (currentPost < numberOfPosts){
			double accurateLocation = currentPost * gapSize + start;
			int roundedLocation = (int) Math.round(accurateLocation); 
			System.out.print(roundedLocation + " ");
			currentPost++;
		}
	}
}
