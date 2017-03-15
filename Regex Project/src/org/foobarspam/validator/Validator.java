package org.foobarspam.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

	static private String dniRegex = "\\b\\d{8}[A-Z&&[^IÑOU]]\\b";
	static private String nieRegex = "\\b[XYZ]\\d{7}[A-Z&&[^IÑOU]]\\b";
	
	static Pattern dniFormat = Pattern.compile(dniRegex);
	static Pattern nieFormat = Pattern.compile(nieRegex);
	
	public static boolean dniValidator(String dni){
		 Matcher verificator = dniFormat.matcher(dni);
		 return verificator.find();
	}
	
	public static boolean nieValidator(String nie) {
		 Matcher verificador = nieFormat.matcher(nie);
		 return verificador.find();
	}
}
