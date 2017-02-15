package org.foobarspam.leapYear;

public class LeapYear {
	
	// variables
	
	private int year = 0;
	
	// constructor
	
	public LeapYear(){
		
	}
	
	public LeapYear(int year){
		this.year = year;
	}
	
	// getters & setters
	
	public int getYear(){
		return this.year;
	}
	
	// logic
	
	public boolean isLeapYear(){
		return ((getYear() % 4 == 0 && getYear() % 100 != 0) || getYear() % 400 == 0);
	}

}