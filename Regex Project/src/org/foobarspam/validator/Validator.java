package org.foobarspam.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	
	// Regular expresion declaration
	static private String dniRegex = "\\b\\d{8}[A-Z&&[^IÑOU]]\\b";
	static private String nieRegex = "\\b\\[XYZ]d{8}\\b";
	
	// Variables holding compiled regex
	static Pattern dniFormat = Pattern.compile(dniRegex);
	static Pattern nieFormat = Pattern.compile(nieRegex);
	
	// Logic - Validators
	public static boolean dniValidator(String dni){
		 Matcher verificador = dniFormat.matcher(dni);
		 return verificador.find();
	}
	
	public static boolean nieValidator(String nie) {
		 Matcher verificador = nieFormat.matcher(nie);
		 return verificador.find();
	}
}
