/* Write a program to display the following pattern 
    *
   ***
  *****
 *******
*********
*/
public class Hill_Pattern_1 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=4;j>=i;j--) //Decreasing Space
			{
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++) //Icreasing Star
	    	 {
	    		 System.out.print("*");
	    	 }
			System.out.println();
		}

	}

}
