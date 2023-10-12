package mypack;
	class Students{	//here we're creating a class
	String name;
	int age;
	//then we're are creating a PrintInfo method
	public void PrintInfo()	{
		System.out.println(this.name);
		System.out.println(this.age);
	}
		//here we are giving parameter to our constructor
		Students(String name, int age){
		this.name=name;
		this.age=age;
		}
	}//in this section of code we're making object 
	public class OOPs_Constructor_Parameter {
	public static void main(String[] args) {
		Students obj = new Students("Shahnoor",18);
		obj.PrintInfo();
	}

}
