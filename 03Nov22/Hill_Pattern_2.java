/* Write a program to display the following pattern

*********
 *******
  *****
   ***
    *
*/


public class Hill_Pattern_2 {

	public static void main(String[] args) {
		int i,j;
		for(i=5;i>=1;i--)
		{
			for(j=5;j>i;j--) //Increasing Space
			{
				System.out.print(" ");
			}
			for(j=1;j<=(2*i)-1;j++) //decreasing Star
	    	 {
	    		 System.out.print("*");
	    	 }
			System.out.println();
		}

	}

}
