package com.promineotech;

public class App {

//	6.     Create a class named App that has a main method.
//	a.  In this class instantiate an instance of each of your logger classes that implement the Logger interface.
//	b. Test both methods on both instances, passing in Strings of your choice.
	
	public static void main(String[] args) {
		//Interface + name of the object + instantiate call new + the implementation of the interface 
		Logger log1 = new AsteriskLogger();
		
		//Interface + name of the object + instantiate call new + the implementation of the interface 
		Logger log2 = new SpacedLogger();
		
		System.out.println("Testing the AsteriskLogger implmenttaion of the Interfce Logger ");
		log1.log("¿Que Pasa?");
		log1.error("Fallo mal");
		log1.toString();
		System.out.println("____________________________________________________________________________ ");

		System.out.println("Testing the SpacedLogger implmenttaion of the Interfce Logger ");
		log2.log("¿Que Pasa con espacios?");
		log2.error("Fallo mal pero con Error y espacios ");
		log2.toString();
		System.out.println("____________________________________________________________________________ ");
		
		
	}

}
