/* Write a program to accept Student details from the user and calculate the result and display the output abstraction
*/

public interface grade_cal { // creating a interface 

	public void grad(int per); // passing parameter
}
---

public class HW_demo extends abs_Demo implements grade_cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HW_demo obj=new HW_demo(); // creating object for callings the function 
		obj.accept();
		obj.calc();
	}

	public void demo()
	{
		
	}
	@Override
	public void calc() { // calculating percentage 
		// TODO Auto-generated method stub
		int total=0;
		
		for(i=0;i<5;i++)
		{
			total+=marks[i];
		}
		
		System.out.println("The total out of 500 is ="+total);
		int per=(total*100)/500;
		grad(per);
	}

	@Override
	public void grad(int per)  // calculating grades 
	{
		// TODO Auto-generated method stub
		if(per<=100 &&per>=70)
		{
			System.out.println("A grade");
		}
		else if (per<=60)
		{
			System.out.println("B grade");
		}
                 else if (per<=50 && per <=40)
		{
			System.out.println("c grade");
		}
                 else 
		{
			System.out.println("fail");
		}
	}	
}
