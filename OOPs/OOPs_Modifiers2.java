package mypack;

//private modifier
//so basically private modifiers does give access of the things you have made private
//you can't directly use them out of the class in which it made
//even you can't use into the subclass of that class where it made
//so how we can use them there is two option 
//either use into the same class or use getters and setters
//in below example we are looking how to use private with the help of getters and setters

	class BankAccounts{
		public String name;			//public modifier
		protected String email; 	//protected modifier
		private String password;	//private modifier
	
		//getter and ssetters
		//as we know we can't use private things directly so we are making getters and setters below
		
		public String getPassword() {
			return this.password;
		}
		public void setPassword(String pass) {
			this.password=pass;
		}
	
	}

public class OOPs_Modifiers2 {
	public static void main(String[] args) {
		BankAccounts account1 = new BankAccounts();
		account1.name="Shaikh";
		account1.email="shaikhshahnoor007@gmail.com";
		//below we are trying to use private normally but this show error
		//so we have to use getter and setter to use this private variable
	//account1.password="abcd";
		//so now we are using setter to give access of private
		account1.setPassword("abcd");
		System.out.println(account1.getPassword());
	}

}
