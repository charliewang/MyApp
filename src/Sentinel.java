public class Sentinel {

	public void start() {

		System.out.println("Enter the exam result (-1 to exit):");
		int exam = Integer.parseInt(Keyboard.readInput());
		int numOfResults = 0;
		int total = 0;

		while (exam != -1) {

			total += exam;
			numOfResults++;
			System.out.println("Enter the exam result (-1 to exit):");
			exam = Integer.parseInt(Keyboard.readInput());

		}
		int average = total / numOfResults;
		System.out.println();
		System.out.println("You entered " + numOfResults + " results.");
		System.out.println("And the average is " + average);

	}

}
