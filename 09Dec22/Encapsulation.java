/*WAP to accept back name, AC NO, Name , Pin no , amount for D or C. End display the Details . AS Name, bank name,Final balance.
*/


import java.util.Scanner;

public class bank_operation  // class for encapsulation 
{
	private int ac_no,pin_no,balance; // private variable 
	String u_name,B_name;
	Scanner sc=new Scanner(System.in); // user input 
	public void set_ac_no(int newval) // method to set a ac no
	{
        ac_no=newval;
	}
	public int get_ac_no() // method to get ac no
	{
		return ac_no;
	}
	public int getPin_no() {
		return pin_no;
	}
	public void setPin_no(int newval) { // set pin number 
		pin_no = newval;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int newval) {
		balance = newval;
	}
	
	public void calc_opr(int cal_Amt,int ch) // function to calculate balance 
	{
		if(ch==1)
		{
			balance=balance-cal_Amt;
		}
		else
	{
			balance=balance+cal_Amt;
		}
		
	}
}
---


public class My_bank extends bank_operation{ // creating another class and inheriting the class into present class an this class. Become child class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My_bank obj=new My_bank(); // object creation for calling the function 
		obj.accept();
		obj.disp();

	}

	public void accept() // creating a function that accept all details of user
	{
		System.out.println("Enter your name");
		u_name=sc.next();
		System.out.println("Enter Your bank name");
		B_name=sc.next();
		System.out.println("Enter your acount number");
		set_ac_no(sc.nextInt());
                System.out.println("Enter your account pin");
		setPin_no(sc.nextInt());
		System.out.println("Enter your choice\n 1:Debit \n 2:Credit");// choosing what user want
		int ch=sc.nextInt();
		System.out.println("Enter your amount");
		int amt=sc.nextInt();
		calc_opr(amt,ch);
	}
	public void disp() // for display all  the details and  balance 
	{
		System.out.println("Welcome :"+u_name);
		System.out.println("To "+B_name);
		System.out.println("Your Accounbt number is ="+get_ac_no());
		System.out.println("Your pin is ="+getPin_no());
		System.out.println("Your balance is ="+getBalance());
	}
}
