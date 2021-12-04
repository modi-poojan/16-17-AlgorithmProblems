package com.Algorithms;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomizeMessage {

	static final String NAME = "<<name>>";
	static final String FULL_NAME = "<<full name>>";
	static final String CONTACT = "x{10}";
	static final String DATE = "([0-9]{2}/){2}[0-9]{4}";
	static String output; 		
	
	public static void stringFunction( String givenString ) {
		
		Pattern firstname = Pattern.compile(NAME);
		Matcher matcher = firstname.matcher(givenString);
		output = matcher.replaceAll("Poojan");
		//System.out.println(output);
		
		Pattern fullname = Pattern.compile(FULL_NAME);
		Matcher matcher_fullname = fullname.matcher(output);
		output = matcher_fullname.replaceAll("Poojan Modi");
		//System.out.println(output);

		Pattern contact = Pattern.compile(CONTACT);
		Matcher matcher_contact = contact.matcher(output);
		output = matcher_contact.replaceAll("8888744621");
		//System.out.println(output);
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime Date = LocalDateTime.now();
		
		Pattern date = Pattern.compile(DATE);
		Matcher matcher_date = date.matcher(output);
		output = matcher_date.replaceAll(dateFormat.format(Date));
		
	}
	
	public static void display() {
		
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		
		String givenString = "Hello <<name>>, We have your full name as <<full name>> in our system.\r\n" 
				+"Your contact number is 91-xxxxxxxxxx.\r\n"
				+ "Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
		
		System.out.println("Given string is :\n\n"+ givenString);
		System.out.println("\nString after Regex and Replacement is \n"); 
		stringFunction(givenString);
		display();
	}
}
