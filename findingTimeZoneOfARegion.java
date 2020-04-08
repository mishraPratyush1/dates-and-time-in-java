package Chapter6;

import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;

public class findingTimeZoneOfARegion {

	public static void main(String[] args) 
	{
		System.out.println("zone ids");
		for(String zone : ZoneId.getAvailableZoneIds())
			System.out.println(zone);
		 
		LocalTime time=LocalTime.now(ZoneId.of("Singapore"));
		System.out.println("local time of "+"Singapore is "+time);
		
		//it gives the GMT i.e greenwich mean time.
		//Greenwich Mean Time is the mean solar time at the Royal
		//Observatory in Greenwich, London, reckoned from midnight
		
		Instant i =Instant.now();
		System.out.println("greenwich "+i);
		
	}

}
