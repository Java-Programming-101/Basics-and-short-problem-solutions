package com.java101;

public class test {

	public static void main(String[] args) {

	int number =11 ;
	int secondNumber =-1;
	
//	while ( number <= 10){
//		System.out.println(number);
//		number++;
//	}
	String myString = ("Hello world");
	
	
	do {
		System.out.println(secondNumber);
		secondNumber--;
		System.out.println(myString);
		myString = myString+myString;
	
	} while (secondNumber <= 0);
	
	
	
	
	}

}
