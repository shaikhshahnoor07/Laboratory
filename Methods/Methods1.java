
		// write a program to print two number using methods

package mypack;
import java.util.Scanner;

public class Methods1 {
	public static int CalculateTheProduct(int a, int b) {
		return(a*b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
	int b = sc.nextInt()	;
	System.out.println("The Product for Two Number is : "+ CalculateTheProduct(a,b));
	
	}

}
