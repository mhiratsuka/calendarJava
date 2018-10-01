//This is a test code for dispCalendar.java

import java.util.Scanner;

public class dispCalendarTest{
	public static void main(String [] args){
		dispCalendar ca = new dispCalendar();
		
		ca.todayCalendar();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year:");
		int inputyear = input.nextInt();
		
		System.out.print("Enter month:");
		int inputmonth = input.nextInt();
		
		System.out.println();
		
		ca.yearlyCalendar(inputyear);
		ca.monthlyCalendar(inputyear, inputmonth);
	
	}//end main
}