public class DiceRolling {

	public void start() {

		System.out.println("Try to guess the total of two dice.");
		System.out.println();

		int total = getTotal();
		int guess = getGuess();
		printResult(guess, total);

	}

	private int getTotal() {
		int dice1 = (int) (Math.random() * 6 + 1);
		int dice2 = (int) (Math.random() * 6 + 1);
		return dice1 + dice2;
	}

	private int getGuess() {
		System.out.println("Enter your guess here:");
		int guess = Integer.parseInt(Keyboard.readInput());
		while ((guess < 2) || (guess > 12)) {
			System.out.println("Invalid guess. Try again.");
			start();
		}
		return guess;
	}

	private void printResult(int guess, int total) {
		if (guess == total) {
			System.out.println("Your guess was correct. You win.");
		} else {
			System.out.println("Your guess was incorrect. You lose.");
		}

	}

}
