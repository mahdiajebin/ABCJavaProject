package com.learning.j10.model;

public class ABC {
	private int number;
	private char upperCase;
	private char lowerCase;
	private String highlight;
	
	
	
	
	public ABC(int number) {
		
		this.number = number;
		this.upperCase = (char)number;
		this.lowerCase =(char) (number + 32);
		
	}
	
	
	
	public String getHighlight() {
		return highlight;
	}



	public void setHighlight(String highlight) {
		this.highlight = highlight;
	}



	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public char getUpperCase() {
		return upperCase;
	}
	public void setUpperCase(char upperCase) {
		this.upperCase = upperCase;
	}
	public char getLowerCase() {
		return lowerCase;
	}
	public void setLowerCase(char lowerCase) {
		this.lowerCase = lowerCase;
	}
	@Override
	public String toString() {
		return "ABC [number=" + number + ", upperCase=" + upperCase + ", lowerCase=" + lowerCase + "]";
	}
	
	

}
