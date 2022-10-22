package day8.utility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtility {

	public static void main(String[] args) {
		System.out.println(getRequiredDateBasedOnNumberOfDays("dd MM yyyy HH:mm:ss",-3));//-3 means past -3 days
		System.out.println(getRequiredDateBasedOnNumberOfDays("dd MMM yyyy",-2));
		System.out.println(getRequiredDateBasedOnNumberOfDays("dd MMMM yyyy",3));//take Capital M for date & small M for minutes
		System.out.println(getRequiredDateBasedOnMonth("dd/MM/yyyy",3));//here we add 3 months extra
		System.out.println(getRequiredDateBasedOnYear("dd MMMM yyyy",5));
		compareDate(12/0/2022,12/10/2022);
	}
	public static String getRequiredDateBasedOnNumberOfDays(String format,int numberOfDays) {
		Calendar cal=Calendar.getInstance();//by default
		cal.add(Calendar.DATE,numberOfDays);//.DATE means number of days &number of days means add that days into current date
		SimpleDateFormat s=new SimpleDateFormat(format);
		return s.format(new Date(cal.getTimeInMillis()));
	}
	public static String getRequiredDateBasedOnMonth(String format,int numberOfMonths) {
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.MONTH, numberOfMonths);//Month to get current month of system
		SimpleDateFormat s=new SimpleDateFormat(format);
		return s.format(new Date(cal.getTimeInMillis()));
	}
	public static String getRequiredDateBasedOnYear(String format,int numberOfYears) {
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.YEAR, numberOfYears);
		SimpleDateFormat s=new SimpleDateFormat(format);
		return s.format(new Date(cal.getTimeInMillis()));
	}
	public static boolean compareDate(int date1,int date2) {
		Calendar cal=Calendar.getInstance();
		System.out.println("Comparison of dates :"+date1);
		return true;
	}

}
