package Chapter6;


import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import chapter3.breaking_to_words;

public class AddOrSubtractFromADate {

	public static void main(String[] args) {
		//today's date
		Scanner sc=new Scanner(System.in);

		LocalDate now=LocalDate.now();
		
		//no of days to add
		System.out.println("enter the no of days to add!");
		int n=sc.nextInt();
		Period p =Period.ofDays(n);
		
		//new date after increasing the day's
		LocalDate then=now.plus(p);
		
		System.out.println("after "+n+" days,new date is "+then);
		
		sc.close();
	}

}
