package mypack;
//a constructor that creates an object using
//another object of the same Java class
class Student{	//here we're creating a class
String name;
int age;
//then we're are creating a PrintInfo method
public void PrintInfo()	{
	System.out.println(this.name);
	System.out.println(this.age);
}
	//here we are giving parameter to our constructor
	Student(Student s2){
	this.name=s2.name;
	this.age=s2.age;
	}
	Student(){
		
	}
}

public class OOPs_ConstructorCopy {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name="Shaikh";
		s1.age=20;
		
		Student s2 = new Student(s1);
		s2.PrintInfo();
	}

}
