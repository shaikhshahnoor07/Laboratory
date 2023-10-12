package mypack;
//Create a Main class
public class OOPs_Constructor_NonParameter {
	int x;  // Create a class attribute

	  // Create a class constructor for the Main class
	  public OOPs_Constructor_NonParameter() {
	    x = 5;  // Set the initial value for the class attribute x
	  }

	  public static void main(String[] args) {
		  OOPs_Constructor_NonParameter myObj = new OOPs_Constructor_NonParameter(); // Create an object of class Main (This will call the constructor)
	    System.out.println(myObj.x); // Print the value of x
	  }
	
}
