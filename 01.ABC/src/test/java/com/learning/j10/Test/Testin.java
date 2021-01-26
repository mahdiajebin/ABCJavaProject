package com.learning.j10.Test;


import com.learning.j10.utility.Utility;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Testin {
	
	
	@Test
	@DisplayName("checking for X")

	public void test1() {
		
		Character[] vowels = {'A', 'E', 'I', 'O', 'U'};
		Character letter = 'X';
		
		boolean status = Utility.in(letter,vowels);
		assertFalse(status);
	}

	@Test
	@DisplayName("checking for E")
		public void test3() {
			
			Character[] vowels = {'A', 'E', 'I', 'O', 'U'};
			Character letter = 'X';
			
			boolean status = Utility.in(letter,vowels);
			assertFalse(status);
		}


	

}
