/*write a Program to Performing Banking Operation Using Constructor  */
package constructor;

import java.util.Scanner;

public class Banking {
	Banking(){                   //constructor 
		System.out.println("Welcome to World Bank....");
		char accountType;//2 type
		Scanner sc = new Scanner(System.in);
		System.out.println("press[c] to Create Account.\npress[l] to LOGIN.");
		accountType=sc.next().charAt(0);
		Banking obj3 = new Banking(accountType);
		
	}
	Banking(char a){                     //Parameterized constructor
		
		if(a=='c') {                       // if Condition (nested)
			create_account();              //Invoking create_account
		}
		else if(a=='l') {                // Else If Condition
			login_account();              //Invoking login_account
		}
		else {                          //Else    
		System.out.println("Invalid input.\nTry Again....");
		}
	}
	
	static Scanner sc = new Scanner(System.in);//---instance type....
	public static void main(String[] args) {
		
		Banking obj = new Banking();              //object creation for invoking constructor
	
	}
	static void create_account() {                  //use to create a new Account
		String name,middlename,surname,id,pass;
		long contactNo;
		int age;
		System.out.println("....Creating Account....");
		System.out.print("Enter The Name:");
		name = sc.next();
		System.out.print("Enter The MiddleName:");
		middlename = sc.next();
		System.out.print("Enter The SurName:");
		surname = sc.next();
		System.out.print("Enter The Age:");
		age = sc.nextInt();
		System.out.print("Enter The ContactNo:");
		contactNo = sc.nextLong();
		System.out.print("Create your ID:");
		id=sc.next();
		System.out.print("Create Your Password:");
		pass=sc.next();
		System.out.println("Account Created Successfully...");
		System.out.println("-------------------------------");
		System.out.println("Name:"+name);
		System.out.println("MiddleName:"+middlename);
		System.out.println("SurName:"+surname);
		System.out.println("Age:"+age);
		System.out.println("Contact number:"+contactNo);
		System.out.println("-------------------------------");
		
		mainSystem();                                   // Invoking mainSystem
		
		
	}
	static void login_account() {
		String og_id="Amar@123",og_pass="Amar@1",id,pass;
		char cont;
		
		System.out.println("Welcome to World Bank's \nLogin Page....");
		do{                                                     //do while loop
			System.out.print("Enter The ID:");
			id=sc.next();
			System.out.print("Enter The Password:");
			pass=sc.next();
			if(og_id.equals(id) && og_pass.equals(pass)) {          //If else loop         
				mainSystem();
			}
			else {
				System.out.println("Invalid Input...");
			}
			System.out.println("To Try Again Press[y].\nTo Exit Press[n].");
			cont = sc.next().charAt(0);
		}while(cont=='y');
		
		
	}
	static void mainSystem() {
		char Sys,cont;// Sys---Bank System,cont----continue.
		int d,c,b,n;
		int balance = 10000;                 //by default Balance 10000
		do{
			System.out.println("press[d]for Deposit....\npress[c]to withdraw....\npress[b]for Check Balance....\npress[n]for NEFT....");
			Sys = sc.next().charAt(0);
			switch (Sys) {                                    //switch case
			case 'd':
				System.out.print("Enter The Amount To Deposit:");
				d=sc.nextInt();
				balance += d; // balance = balance + d;                 //Calculation
				System.out.println("Credited sucessfully");
				System.out.println("Current Balance:"+balance);
				break;
			case 'c':
				System.out.print("Enter The Amount To Withdraw:");
				c=sc.nextInt();
				balance -= c; // balance = balance - c;                       
				System.out.println("Debited sucessfully");
				System.out.println("Current Balance:"+balance);
				break;
			case 'b':
				System.out.println("Current Balance:"+balance);
				break;
			case 'n':
				System.out.print("Enter The Amount To NEFT:");
				n=sc.nextInt();
				System.out.println(n+" Will be Debited in few hours...");
				break;
			}
			System.out.println("To Continue Press[y].\nTo Exit Press[n].");                     
			cont = sc.next().charAt(0);
		}while(cont=='y');
	}
}
