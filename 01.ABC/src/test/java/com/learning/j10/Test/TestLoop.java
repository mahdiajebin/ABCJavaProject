package com.learning.j10.Test;


import com.learning.j10.utility.Utility;
import static org.junit.jupiter.api.Assertions.*;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestLoop {
	
//generics <T> 

//consumer 
	public static void booboo(int x) {
		System.out.println(x*2);
	}
	
	//predicate 
	public static boolean isEven(Integer n) {
		return n % 2 == 0;
	}
	
	@Test
	@DisplayName("Java 8 simple loop")

	
	public void test1() {
		
		
		
		IntConsumer x = TestLoop::booboo;
		IntConsumer y = System.out::println;
		
		IntStream.rangeClosed(1,30)
			//	.filter(TestLoop::isEven)
		.filter( e -> e % 2 ==0)
				.forEach(y);
	}



	

	

}
