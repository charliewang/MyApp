import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class DataConvert {
	
	public void start() {
		System.out.println("Enter the date: ");
		String dateEntered = Keyboard.readInput();
		String dateConverted = convertDateFormat(dateEntered);
	}

	private String convertDateFormat(String dateEntered) {
		DateFormat original = new SimpleDateFormat("dd/MM/yy", Locale.ENGLISH);
		DateFormat target = new SimpleDateFormat("dd-MM-yy");
		Date date = null;
		try {
			date = original.parse(dateEntered);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String dateConverted = target.format(date);
		return dateConverted;
	}


}
