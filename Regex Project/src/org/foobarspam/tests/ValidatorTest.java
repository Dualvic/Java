package org.foobarspam.tests;

import org.foobarspam.validator.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class ValidatorTest {

	@Test
	public void correctDniTest() {

		assertTrue(Validator.dniValidator("72276163G"));

		assertTrue(Validator.dniValidator("11827530D"));

		assertTrue(Validator.dniValidator("43255773T"));

	}
	
	@Test
	public void incorrectDniTest() {

		assertFalse(Validator.dniValidator("7227163G"));

		assertFalse(Validator.dniValidator("A1827530D"));

		assertFalse(Validator.dniValidator("T4325773T"));

	}
	
	@Test
	public void correctNie() {
		
		assertTrue(Validator.nieValidator("X1234567T"));

		assertTrue(Validator.nieValidator("Y1234567T"));

		assertTrue(Validator.nieValidator("Z1234567T"));
	}
	
	@Test
	public void incorrectNie() {
		
		assertFalse(Validator.nieValidator("Ñ1234567T"));

		assertFalse(Validator.nieValidator("21234567T"));

		assertFalse(Validator.nieValidator("111234567T"));
	}

}
