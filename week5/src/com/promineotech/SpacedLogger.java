package com.promineotech;
//3.     Create two classes that implement the Logger interface
//a.  AsteriskLogger
//b.  SpacedLogger

public class SpacedLogger implements Logger {	
//	5. Implement the SpacedLogger methods:
//	Note:  The SpacedLogger should add a space or " " between each character of the 
		//String argument passed into its methods.
//	a. If the log method received “Hello” as an argument, it should print H e l l o
//	b. The error method should do the same, but with “ERROR:” preceding the spaced out 
		//input (i.e. ERROR: H e l l o)
	
	@Override
	public void log(String message) {
		String temp = "";
		for (int i=0;i<message.length();i++)
		{
			temp += message.charAt(i) + " ";
		}
		System.out.println(temp);		
	}

	@Override
	public void error(String error) {
		String temp = "";
		for (int i=0;i<error.length();i++)
		{
			temp += error.charAt(i) + " ";
		}
		System.out.println("ERROR: " + temp);		
	}

}
