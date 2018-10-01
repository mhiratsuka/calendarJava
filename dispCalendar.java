//This application displays monthly calenders this year.

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Formatter;

public class dispCalendar{
	public int year; 	//current year
	public int month;	//month
	public int date;	//date 
	public int day;	//the day of the week
	private int firstdate = 1; //the first date of the month
	public int lastdate;	//the last date of the month 
	public int[][] monthcalendar = new int[6][7]; //make a calendar structure
	private String[] engmonth= {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};//to make an array assigned day in english
	public int firstday;	//the first day of the month

	
	
	//get today's date
	Calendar cal = new GregorianCalendar();

	
	public void todayCalendar(){
		//display today's date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd, E, 'at' KK:mma");
		System.out.println("Today: " + sdf.format(cal.getTime()));
		System.out.println("");
	}//end method todayCalendar
	
	public void yearlyCalendar(int inputyear){
		System.out.println("The following is the yearly calendar.");
		for (month = 0; month < 12; month++){
			//get the year
			year = inputyear;
			cal.set(Calendar.YEAR, year);
			
			//Display the month and the year
			System.out.println(engmonth[month] + ", " + year);
			
			//get the first day of the month
			cal.set(Calendar.MONTH, month);
			cal.set(Calendar.DATE, firstdate);
			day = cal.get(Calendar.DAY_OF_WEEK);
						
			//get the last date of the month
			lastdate = cal.getActualMaximum(Calendar.DATE);
			
			//assign days to 2D Array monthcalendar
			int row = 0;
			int column = day -1;
			for (int date = 1; date <= lastdate; date++){
				monthcalendar[row][column] = date;
				if(column==6){
					row++;
					column = 0;
				}else{
					column++;
				}//end if/else statement
			}//end for loop
			
			//display spaces before the date starts 
			int daycount = day -1;
			if(daycount != 0){
				for(int i = 0; i < daycount; i++ ){
					System.out.print(" ");
				}//end for loop
			}//end if/else statement
			
			//display calendar
			for(row = 0; row < monthcalendar.length; row++){
				for(column =0; column <monthcalendar[0].length ;column++){
					int datedisplay = monthcalendar[row][column];
					if(datedisplay == 0){
						System.out.print("  ");
					} else if(1 <= datedisplay && datedisplay <= 9){
						System.out.print(String.format("%3d", datedisplay));
					} else {
						System.out.print(String.format("%3d", datedisplay));
					}//end if/else statement
				}//end for loop
				System.out.println();
			}//end for loop
			
			//assign 0 to 2D array monthcalendar
			for(row = 0; row < monthcalendar.length; row++){
				for(column =0; column <monthcalendar[0].length ;column++){
					monthcalendar[row][column] = 0;
				}//end for loop
			}//end for loop
		}//end for loop
	}//end method monCalendar
	
	
	public void monthlyCalendar(int inputyear, int inputmonth){
		System.out.println("");
		System.out.println("The following is the monthly calendar.");
		//get the year and month
			year = inputyear;
			cal.set(Calendar.YEAR, year);
		
			month = inputmonth -1;
			cal.set(Calendar.MONTH, month);
			
			//Display the month and the year
			System.out.println(engmonth[month] + ", " + year);
			
			//get the first day of the month
			cal.set(Calendar.DATE, firstdate);
			day = cal.get(Calendar.DAY_OF_WEEK);
						
			//get the last date of the month
			lastdate = cal.getActualMaximum(Calendar.DATE);
			
			//assign days to 2D Array monthcalendar
			int row = 0;
			int column = day -1;
			for (int date = 1; date <= lastdate; date++){
				monthcalendar[row][column] = date;
				if(column==6){
					row++;
					column = 0;
				}else{
					column++;
				}//end if/else statement
			}//end for loop
			
			//display spaces before the date starts 
			int daycount = day -1;
			if(daycount != 0){
				for(int i = 0; i < daycount; i++ ){
					System.out.print(" ");
				}//end for loop
			}//end if/else statement
			
			//display calendar
			for(row = 0; row < monthcalendar.length; row++){
				for(column =0; column <monthcalendar[0].length ;column++){
					int datedisplay = monthcalendar[row][column];
					if(datedisplay == 0){
						System.out.print("  ");
					} else if(1 <= datedisplay && datedisplay <= 9){
						System.out.print(String.format("%3d", datedisplay));
					} else {
						System.out.print(String.format("%3d", datedisplay));
					}//end if/else statement
				}//end for loop
				System.out.println();
			}//end for loop
	
	}
}//end dispCalendar