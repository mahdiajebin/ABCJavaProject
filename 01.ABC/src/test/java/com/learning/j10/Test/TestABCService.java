package com.learning.j10.Test;

import com.learning.j10.utility.Utility;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.learning.j10.Service.ABCService;
import com.learning.j10.model.ABC;
public class TestABCService {



	
	
	@Test
	@DisplayName("checking for displayMode = abc, highlight = abc")

	public void test1() {
		
		ABCService service = new ABCService();
		String displayMode = "abc";
		
		String highlight = "abc";
		
		/*
		 * displayMode = abc, highlight = abc - show everything highlight nothing.
		 * displayMode = abc, highlight = vow 0 show everything and highlight vowels
		 *
		 */
		ABC[] letters = service.getAlphabets(displayMode, highlight); 
		
		
		boolean status = letters.length == 26;
		assertTrue(status);
	}

	
	@Test
	@DisplayName("checking for displayMode = vow, highlight = abc")
	
	public void test2() {
		
		ABCService service = new ABCService();
		String displayMode = "vow";
		
		String highlight = "abc";
		
		/*
		 * displayMode = vow, highlight = abc - show everything highlight nothing.
		 * displayMode = abc, highlight = vow 0 show everything and highlight vowels
		 *
		 */
		ABC[] letters = service.getAlphabets(displayMode, highlight); 
		
		
		boolean status = letters.length == 5;
	    assertTrue(status);
	}


	@Test
	@DisplayName("checking for displayMode = con, highlight = abc")
	
	public void test3() {
		
		ABCService service = new ABCService();
		String displayMode = "con";
		
		String highlight = "abc";
		
		/*
		 * displayMode = vow, highlight = abc - show everything highlight nothing.
		 * displayMode = abc, highlight = vow 0 show everything and highlight vowels
		 *
		 */
		ABC[] letters = service.getAlphabets(displayMode, highlight); 
		
		
		boolean status = letters.length == 21;
		assertTrue(status);
	}
	

	

	

}


