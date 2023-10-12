package mypack;
/*basically polymorphism is when u use one method or function with many different ways that is called as 
in this program we have made multiple methods with same name but when the parameter it take is diffetern 
it all the parameter is pass the the eligable method will run
like below we are pass name and age as parameter then the method who is capable to take that parameter and run that is going to executed*/
class Mentees{
	String name;
	int age;
	public void PrintInfo(String name) {
		System.out.println(name);
		}
	public void PrintInfo(int age) {
		System.out.println(age);
	}
	public void PrintInfo(String name, int age) {
			System.out.println("Name of Mentees is "+name+"and age is"+age);
	}
}
public class OOPs_Polymorphism {
	public static void main(String[] args) {
		Mentees s1 = new Mentees();
		s1.name="Aman";
		s1.age=12;
		
		s1.PrintInfo(s1.name,s1.age);
	}

}
