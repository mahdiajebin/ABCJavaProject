package com.learning.j10.Test;


import com.learning.j10.utility.Utility;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestingNumbers {
	
	
	
	
	
	@Test
	@DisplayName("checking for X")

	public void test1() {
		
		String[] vowels = {"A", "E", "I", "I", "U"};
		String letter = "X";
		
		boolean status = Utility.in(letter,vowels);
		assertFalse(status);
	}

	@Test
	@DisplayName("checking for int")
	public void test2() {
		
		Integer[] vowels = {40, 65, 300, 400, 345};
		Integer letter = 55;
		
		boolean status = Utility.in(letter,vowels);

		assertFalse(status);
	}

	
	@Test
	@DisplayName("checking for int")
	public void test3() {
		
		Integer[] vowels = {40, 65, 300, 400, 345};
		Integer letter = 77;
		
		boolean status = Utility.in(letter,vowels);
		assertFalse(status);
	}

	

	

	

}
