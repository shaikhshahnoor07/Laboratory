
			//write a program to find factorial of a number

package mypack;
import java.util.*;
public class Methods2 {
	
public static void PrintFactorial(int n) {
	if(n<0) {
		System.out.println("Invalid Number!!!!!!");
	
		return;
	}
	//loop
	int fact = 1;
	for(int i = n; i>=1;i--) {
		fact = fact * i;
	}
	System.out.println(fact);
}
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	PrintFactorial(n);
}
}
