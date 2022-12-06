import java.util.Scanner;

public class ATM_Machine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM_Machine obj = new ATM_Machine();
		obj.ATM_Machine();

	}
	public void ATM_Machine()
	{
		//declare and initialize balance, withdraw, and deposit
		int balance=10000, withdraw, deposit;
		//create scanner class object to get choice of user
		Scanner sc = new Scanner (System.in);
		while(true)
		{
			System.out.println("Welcome to ATM Machine...");
			System.out.println("Select 1 for withdraw");
			System.out.println("Select 2 for deposite");
			System.out.println("Select 3 for check balance");
			System.out.println("Select 4 for exit");
			System.out.print("Select the operation you want to perform:");
			
			int num = sc.nextInt();
			switch(num)
            {
                case 1:
                System.out.print("Enter money to be withdrawn:");
                withdraw = sc.nextInt();
                
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println(" The Current Balance : " + balance);
            		System.out.println();
                    System.out.println("Please collect your money");
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;
                
                case 2:
	                System.out.print("Enter money to be deposited:");
	                deposit = sc.nextInt();
	                balance = balance + deposit;
	                System.out.println("Your Money has been successfully depsited");
	                System.out.println(" The total amount is : " + balance);
	                System.out.println("");
	                break;
	                
                case 3:
	                System.out.println("Balance : "+balance);
	                System.out.println("");
	                break;
	 
	            case 4:
	                System.exit(0);
		}
		
	}
}
}
