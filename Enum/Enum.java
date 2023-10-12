package mypack;
/*
 * An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).

To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters:
 */
enum Level{
	Low,
	Medium,
	High
}

public class Enum {
	public static void main(String[] args) {
		Level mylevel = Level.Medium;
		System.out.println(mylevel);
	}

}
