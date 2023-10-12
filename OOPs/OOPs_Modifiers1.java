package mypack;
//protected modifier
//The code is accessible in the same package and subclasses

class Acccount{
	public String name;
	protected String email;
}
public class OOPs_Modifiers1 {
	public static void main(String[] args) {
		Acccount account1 = new Acccount();
		account1.name="Shaikh";
		account1.email="shaikhshahnoor007@gamail.com";
	}
}
