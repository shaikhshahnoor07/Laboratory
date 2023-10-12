package mypack;

//public modifier
//so basically modifiers are basically you are giving access to one class to another
// by using public,private,protected etc
//in below example we are using public access modifier and giving access of class Account to our main class



	class Account{
		public String name;
	}
public class OOPs_Modifiers {
	public static void main(String[] args) {
		Account account1 = new Account();
		account1.name="Shaikh Shahnoor";
	}
}

