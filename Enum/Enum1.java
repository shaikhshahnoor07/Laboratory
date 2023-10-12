package mypack;
/*
 * Enum inside a Class
You can also have an enum inside a class:
 */
public class Enum1 {
	enum Speed{
		Slow,
		Mediium,
		Fast
	}
	public static void main(String[] args) {
		Speed myspeed = Speed.Fast;
		System.out.println(myspeed);
	}
}
