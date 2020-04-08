package Chapter6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormattingDatesAndTimes {

	public static void main(String[] args) 
	{
		
		Date today = new Date();
		System.out.println(today);
		
		//to format using desired type
		SimpleDateFormat f = new SimpleDateFormat("MMMM-dd-y");
		System.out.println(f.format(today));
 		
	}

}
