package Chapter6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

public class FindingTodaysDate {

	public static void main(String[] args) 
	{
		Date date=new Date(); //this gives entire information like day date time location
		System.out.println(date);
		//this gives todays date.
		
		
		
		
		System.out.println(LocalDate.now());
		//this gives todays time upto milliseconds
		System.out.println(LocalTime.now());
		//both date and time.
		System.out.println(LocalDateTime.now());
		
		//to get a particular date
//		here we have taken month.november because if take 11 then it can be counted from 0 or 1
//		hence we take month. ;
		
		System.out.println(LocalDate.of(1999, Month.NOVEMBER, 5));
		System.out.println(LocalTime.of(12, 32));//specific time
		

		
		
	}

}
