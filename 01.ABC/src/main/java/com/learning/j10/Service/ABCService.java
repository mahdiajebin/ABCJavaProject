package com.learning.j10.Service;


import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

import com.learning.j10.model.ABC;
import com.learning.j10.utility.Utility;


public class ABCService {
	
	
	
	
//	public static String itdoesntmatter(String something) {
//		return "something";
//	}
//	
//	public static int makeNumber(String something) {
//		return 4;
//	}

	public ABC[] getAlphabets(String displayMode, String highlight) {
		
	//functional mode 
		
		Predicate<ABC> isPlaceHolder = e -> false;
		Predicate<ABC> isABCMode = e-> true;
		Predicate<ABC> isVowel = e -> Utility.in(e.getUpperCase(), 'A','E','I','O','U');
		Predicate<ABC> isConsonant = isVowel.negate();

		
		if (displayMode.equals("abc")) {
			isPlaceHolder = isABCMode;
			
		}
		
		else if (displayMode.equals("vow")) {
			isPlaceHolder = isVowel;
			
		}
	
		
		else if (displayMode.contentEquals("con")) {
			isPlaceHolder = isConsonant;
		}
		
	
		
		
		
	Function<ABC,ABC> funcHighlight = abc->{
		if (highlight.contentEquals("vow") && isVowel.test(abc)) {
			abc.setHighlight("highlight");
		}
		else if (highlight.contentEquals("con") && isConsonant.test(abc)) {
			abc.setHighlight("highlight");
		}
		return abc;
	};
	
	ABC[] letters =	IntStream.rangeClosed(65, 90)
				.mapToObj(ABC::new)
				.filter(isPlaceHolder)
				.map(funcHighlight)
				.toArray(ABC[]::new);
		
				
		return letters;
	}


}
