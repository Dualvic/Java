package org.foobarspam.testing;

import static org.junit.Assert.*;
import org.foobarspam.leapYear.LeapYear;
import org.junit.Test;

public class LeapYearTest {

	// Tests with Leap Years
	
	@Test
	public void test_leap_zero() {
		LeapYear year1940 = new LeapYear(1940);
		LeapYear year2080 = new LeapYear(2080);
		assertTrue(year1940.isLeapYear());
		assertTrue(year2080.isLeapYear());

	}

	@Test
	public void test_leap_four() {
		LeapYear year1944 = new LeapYear(1944);
		LeapYear year1904 = new LeapYear(1904);
		assertTrue(year1944.isLeapYear());
		assertTrue(year1904.isLeapYear());
	}

	@Test
	public void test_leap_eight() {
		LeapYear year2168 = new LeapYear(2168);
		LeapYear year1988 = new LeapYear(1988);
		assertTrue(year2168.isLeapYear());
		assertTrue(year1988.isLeapYear());
	}

	@Test
	public void test_no_seculars() {
		LeapYear year2400 = new LeapYear(2400);
		assertTrue(year2400.isLeapYear());
		
	}

	// Tests with non Leap Years
	
	@Test
	public void test_leap_five(){
		LeapYear year1555 = new LeapYear(1555);
		LeapYear year2135 = new LeapYear(2135);
		assertFalse(year1555.isLeapYear());
		assertFalse(year2135.isLeapYear());
	}
	
	@Test
	public void test_seculars() {
		LeapYear year2100 = new LeapYear(2100);
		LeapYear year1300 = new LeapYear(1300);
		assertFalse(year2100.isLeapYear());
		assertFalse(year1300.isLeapYear());
	}
}