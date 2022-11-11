/* Write a program to display the following pattern
A
BC
DEF
GHIJ
KLMNO
*/

public class Char_Pattern {

	public static void main(String[] args) {
		int i,j;
		char ch='A'; //Declare Character
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++) //Increasing char
			{
				System.out.print(ch+"");
				ch++;
			}

			System.out.println();
		}

	}

}
