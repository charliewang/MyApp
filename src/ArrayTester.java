
public class ArrayTester {
	public void start() {
		String [] words = {"one", "two", "three"};
		String [] words2;
		words2 = new String [words.length];
		for(int counter = 0; counter < words.length; counter++) {
			System.out.print(words[counter] + " ");
		}
		System.out.println();
		for(int counter = 0; counter < words2.length; counter++) {
			words2[counter] = words[counter];
			System.out.print(words2[counter] + " ");
		}
		words[0] = "zero";
		for(int counter = 0; counter < words2.length; counter++) {
			words2[counter] = words[counter];
			System.out.print(words2[counter] + " ");
		}
		System.out.println();
		System.out.println(words[1]);
		System.out.println(words2[1]);
		System.out.println(words.equals(words2));
		System.out.println(words == words2);
		System.out.println(words == words2);
	}
	public int [] addArrays(int [] a, int [] b) {
		int [] sum = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			sum [i] = a[i] + b[i];
		}
		return sum;
	}
	int [] a = {1, 2, 3};
	int [] b = {1, 2, 3};
	int [] c = addArrays(a, b);
}
