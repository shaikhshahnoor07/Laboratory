package mypack;

class Pen{
	String color;
	String type; //ball point;gel
	public void write() {
		System.out.println("Writing Something");
	}
}
public class OOPs_ClassesAndObjects {
	public static void main(String[] args) {
		Pen pen1 = new Pen();
		pen1.color="blue";
		pen1.type="gel";
		pen1.write();
	}

}
