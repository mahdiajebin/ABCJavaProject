package com.learning.j10.utility;

import java.util.function.Function;

public class Utility {
	
	public static <T> boolean in(T input, T... data) {
		
		boolean isFound = false;
		for (T row : data) {
			if(input.equals(row)) {
				isFound = true;
				break;
			}
		}
		
		
		return isFound;
		
	}

	public static String isNull(Function<String,String>func, String parameter, String defaultValue) {
		
		String value = func.apply(parameter);
		
		value = value == null ? defaultValue: value;
		
		return value;
		
	}
	
	
}

//	public static boolean in(Character input, Character[] data) {
//		// TODO Auto-generated method stub
//		boolean isFound = false;
//		for (Character row : data) {
//			if(input.equals(row)) {
//				isFound = true;
//				break;
//			}
//		}
//		
//		
//		return isFound;
//	}
//	
//	public static boolean in(String input, String[] data) {
//		// TODO Auto-generated method stub
//		boolean isFound = false;
//		for (String row : data) {
//			if(input.equals(row)) {
//				isFound = true;
//				break;
//			}
//		}
//		
//		
//		return isFound;
//	}
//	
//
//
//
//public static boolean in(Integer input, Integer[] data) {
//	// TODO Auto-generated method stub
//	boolean isFound = false;
//	for (Integer row : data) {
//		if(input.equals(row)) {
//			isFound = true;
//			break;
//		}
//	}
//	
//	
//	return isFound;
//}
//
//
//}



