package mypack;
class Bike{
	String color;
	String type; 
	public void PrintColor() {
		System.out.println(this.color);
	}
}
public class OOPs_this {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bike honda = new Bike();
		honda.color="Red";
		honda.type="Bobber";
		
		Bike yamaha = new Bike();
		yamaha.color="Black";
		yamaha.type="Sports";
		
		honda.PrintColor();
		yamaha.PrintColor();
		
		
	}

}
