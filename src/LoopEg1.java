
public class LoopEg1 {
	
	public void start(){
		
		// Read inputs from user
		System.out.println("Enter the starting position: ");
		int start = Integer.parseInt(Keyboard.readInput());
		
		System.out.println("Enter the number of posts: ");
		int numberOfPosts = Integer.parseInt(Keyboard.readInput());
		
		System.out.println("Enter the distance to cover: ");
		int distance = Integer.parseInt(Keyboard.readInput());
		
		System.out.println();
		System.out.println("Fence post locations:");
		
	
		// Initialize values
		double gapSize = distance / (numberOfPosts - 1);
		int currentPost = 0;
		
		while (currentPost < numberOfPosts){
			double accurateLocation = currentPost * gapSize + start;
			int roundedLocation = (int) Math.round(accurateLocation); 
			System.out.print(roundedLocation + " ");
			currentPost++;
		}
		
	}

}
