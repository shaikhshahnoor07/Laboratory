
  // Create a checkAge() method with an integer variable called age with if/else and Scanner


package mypack;
import java.util.Scanner;
public class Methods5 {
public static void CheckAge(int Age) {
	//if age is less than 18 then it  will show access denied
	if(Age<18) {
		System.out.println("Access Denied - You are not old enough!");
		//if age is equal or greater than 18 than it will show you're old enough
	}else {
		System.out.println("Access granted - You are old enough!");
	}
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please Enter your Age to Veerify...");
	int Age = sc.nextInt();
	CheckAge(Age);
	
	
}
}
