package Chapter6;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class NumberOfDaysBetweenTwoDates {

	public static void main(String[] args) 
	{
		
		String before="2017-05-24";
		String after="2017-07-29";
		LocalDate bef=LocalDate.parse(before);
		LocalDate aft=LocalDate.parse(after);
		int noOfDays=Math.abs((int) ChronoUnit.DAYS.between(aft, bef));
		System.out.println(noOfDays+" days between "+before+" and "+after);
		
	}

}
