package mypack;
/*Abstract Class

⚫ An abstract class must be declared with an abstract keyword. 
⚫ It can have abstract and non-abstract methods.
⚫It cannot be instantiated.
⚫It can have constructors and static methods also.
⚫It can have final methods which will force the subclass not to change the body of the method.*/
//so abstract is basically when you hide some part of code and show some it is called as abstract 


	abstract class Animal{
		abstract void walk();
		
	}
	class Horse extends Animal{
		public void walk() {
			System.out.println("WAlk on 4 legs");
		}
	}
	class Chicken extends Animal{
		public void walk() {
			System.out.println("Walk on 2 legs");
		}
		
	}

public class OOPs_Abstraction {
	public static void main(String[] args) {
		Horse horse = new Horse();
		horse.walk();
	}

}
