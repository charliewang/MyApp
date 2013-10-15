public class TimesTable {

	public void start() {

		System.out.println("Enter the number of the table to print:");

		int num = Integer.parseInt(Keyboard.readInput());

		final int START = 1;
		final int END = 10;

		int count = START;
		while (count < END) {
			System.out.println(count + " * " + num + " = " + count * num);
			count++;
		}

	}

}
