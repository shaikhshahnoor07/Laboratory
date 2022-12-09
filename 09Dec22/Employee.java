/*1)WAP  to create a process which will store the employee details and calculate the employee gross salary and net salary.
(Using Inheritance)*/
package shruti;

import java.util.Scanner;

public class employee {
	Scanner Sc=new Scanner(System.in);// for user input
	String name,emailID;
	int id ;
	long contactno;
	int Grosssal,netsalary;
	int CTC;
public void accept() //creating function
{
	System.out.println("Enter your name =");
	name= Sc.next();
	System.out.println("Enter your ID =");
	id= Sc.nextInt();
	System.out.println("Enter your contact number =");
	contactno= Sc.nextLong();
	System.out.println("Enter your EmailID =");
	name= Sc.next();
	System.out.println("Enter your Gross Salary =");
	Grosssal= Sc.nextInt();
package shruti;

public class calculation extends employee { //inheriting a class
	public void calc()// creating function
	{
		accept();// calling a function from class employee
	System.out.println("your GrossSalary is="+Grosssal);
	  CTC=(Grosssal/100)*25;// formula (FOR CTC)
	 netsalary=(Grosssal-CTC);// formula(FOR NETSALARY)
	 System.out.println("your Net Salary="+netsalary);
	}
}
package shruti;

public class employee_main extends calculation{

	public static void main(String[] args) {
		employee_main obj=new employee_main();//creating object
		obj.calc ();// function calling from class calculation
	}

}
