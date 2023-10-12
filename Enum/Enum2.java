package mypack;
/*
 * Enum in a Switch Statement
Enums are often used in switch statements to check for corresponding values:
 */

enum Height {
	  LOW,
	  MEDIUM,
	  HIGH
	}

public class Enum2 {

	public static void main(String[] args) {
		Height myVar = Height.MEDIUM;

	    switch(myVar) {
	      case LOW:
	        System.out.println("Low level");
	        break;
	      case MEDIUM:
	         System.out.println("Medium level");
	        break;
	      case HIGH:
	        System.out.println("High level");
	        break;
	    }
	}
}
