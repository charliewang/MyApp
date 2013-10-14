import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Keyboard {

	private static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	
	public static String readInput() {
		try {
			return input.readLine();
		} catch(IOException e) {}
		return null;
	}
	
}
