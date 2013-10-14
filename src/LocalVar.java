
public class LocalVar {

	public void start() {
		int first = 0;
		System.out.println(first);
		secondMethod();
	}

	private void secondMethod() {
		int second = 5;
		second = second + 4;
		System.out.println(second);
		
	}
	
}
